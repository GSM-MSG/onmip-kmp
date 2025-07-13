package com.msg.onmip.feature.survey.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.msg.onmip.feature.survey.model.SurveyEffect
import com.msg.onmip.feature.survey.model.SurveyIntent
import com.msg.onmip.feature.survey.model.SurveyState
import com.msg.onmip.shared.model.SurveyData
import com.msg.onmip.shared.repository.SurveyRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import com.msg.onmip.shared.utils.Logger as AppLogger

class SurveyViewModel(
    private val coroutineScope: CoroutineScope,
    private val surveyRepository: SurveyRepository,
) {
    var state by mutableStateOf(SurveyState())
        private set

    private val _effects = mutableListOf<SurveyEffect>()
    val effects: List<SurveyEffect> get() = _effects.toList()

    fun processIntent(intent: SurveyIntent) {
        AppLogger.debug("SurveyViewModel", "Processing intent: $intent")

        when (intent) {
            is SurveyIntent.NextPage -> handleNextPage()
            is SurveyIntent.PreviousPage -> handlePreviousPage()
            is SurveyIntent.SelectGender -> {
                AppLogger.info("SurveyViewModel", "Gender selected: ${intent.gender}")
                state = state.copy(gender = intent.gender)
                handleNextPage()
            }

            is SurveyIntent.UpdateHeight -> {
                state = state.copy(height = intent.height)
            }

            is SurveyIntent.UpdateWeight -> {
                state = state.copy(weight = intent.weight)
            }

            is SurveyIntent.SelectBodyType -> {
                AppLogger.info("SurveyViewModel", "Body type selected: ${intent.bodyType}")
                state = state.copy(bodyType = intent.bodyType)
                handleNextPage()
            }

            is SurveyIntent.ToggleStyle -> {
                val newStyles = state.preferredStyles.toMutableSet()
                if (newStyles.contains(intent.style)) {
                    newStyles.remove(intent.style)
                } else {
                    newStyles.add(intent.style)
                }
                state = state.copy(preferredStyles = newStyles)
            }

            is SurveyIntent.SubmitSurvey -> handleSubmitSurvey()
        }
    }

    private fun handleNextPage() {
        if (state.currentPage < 4) {
            val nextPage = state.currentPage + 1
            AppLogger.debug("SurveyViewModel", "Moving to next page: $nextPage")
            state = state.copy(currentPage = nextPage)
            addEffect(SurveyEffect.NavigateToPage(nextPage))
        }
    }

    private fun handlePreviousPage() {
        if (state.currentPage > 0) {
            val previousPage = state.currentPage - 1
            AppLogger.debug("SurveyViewModel", "Moving to previous page: $previousPage")
            state = state.copy(currentPage = previousPage)
            addEffect(SurveyEffect.NavigateToPage(previousPage))
        }
    }

    private fun handleSubmitSurvey() {
        AppLogger.info(
            "SurveyViewModel",
            "Submitting survey... Gender: ${state.gender}, Height: ${state.height}, Weight: ${state.weight}, Body Type: ${state.bodyType}, Preferred Styles: ${state.preferredStyles}"
        )

        if (isSurveyValid()) {
            coroutineScope.launch {
                addEffect(SurveyEffect.ShowLoading)
                state = state.copy(isLoading = true)

                try {
                    val surveyData = SurveyData(
                        gender = state.gender!!,
                        height = state.height.toInt(),
                        weight = state.weight.toInt(),
                        bodyType = state.bodyType!!,
                        preferredStyles = state.preferredStyles.toList()
                    )

                    AppLogger.debug("SurveyViewModel", "Survey data: $surveyData")
                    surveyRepository.submitSurvey(surveyData)

                    addEffect(SurveyEffect.HideLoading)
                    addEffect(SurveyEffect.SurveyCompleted)
                    state = state.copy(isLoading = false, isCompleted = true)
                    AppLogger.info("SurveyViewModel", "Survey submitted successfully")
                } catch (e: Exception) {
                    AppLogger.error("SurveyViewModel", "Failed to submit survey", e)
                    addEffect(SurveyEffect.HideLoading)
                    addEffect(SurveyEffect.ShowError(e.message ?: "설문 제출 중 오류가 발생했습니다"))
                    state = state.copy(isLoading = false, error = e.message)
                }
            }
        } else {
            AppLogger.warning("SurveyViewModel", "Survey validation failed")
            addEffect(SurveyEffect.ShowError("모든 필수 항목을 입력해주세요"))
        }
    }

    private fun isSurveyValid(): Boolean {
        return state.gender != null &&
                state.height.isNotEmpty() &&
                state.weight.isNotEmpty() &&
                state.bodyType != null &&
                state.preferredStyles.isNotEmpty()
    }

    private fun addEffect(effect: SurveyEffect) {
        _effects.add(effect)
    }

    fun clearEffects() {
        _effects.clear()
    }

    fun canGoNext(): Boolean {
        return when (state.currentPage) {
            0 -> state.gender != null
            1 -> state.height.isNotEmpty()
            2 -> state.weight.isNotEmpty()
            3 -> state.bodyType != null
            4 -> state.preferredStyles.isNotEmpty()
            else -> false
        }
    }
} 