package com.msg.onmip.feature.survey

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.backhandler.BackHandler
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.msg.onmip.feature.survey.components.BodyTypeScreen
import com.msg.onmip.feature.survey.components.GenderSelectScreen
import com.msg.onmip.feature.survey.components.HeightInputScreen
import com.msg.onmip.feature.survey.components.StylePreferenceScreen
import com.msg.onmip.feature.survey.components.WeightInputScreen
import com.msg.onmip.feature.survey.model.SurveyEffect
import com.msg.onmip.feature.survey.model.SurveyIntent
import com.msg.onmip.feature.survey.viewmodel.SurveyViewModel
import com.msg.onmip.shared.ui.components.ProgressBar
import com.msg.onmip.shared.ui.theme.color.Black
import com.msg.onmip.shared.ui.theme.color.White
import com.msg.onmip.shared.ui.theme.typography.AppFont

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SurveyPage(
    modifier: Modifier = Modifier,
    viewModel: SurveyViewModel = rememberSurveyViewModel(),
) {
    val state by remember { derivedStateOf { viewModel.state } }
    val effects by remember { derivedStateOf { viewModel.effects } }
    val pagerState = rememberPagerState(pageCount = { 5 })

    // Effects 처리
    LaunchedEffect(effects) {
        effects.forEach { effect ->
            when (effect) {
                is SurveyEffect.NavigateToPage -> {
                    pagerState.animateScrollToPage(page = effect.page)
                }

                is SurveyEffect.ShowLoading -> {
                    // 로딩 표시 (예: Snackbar)
                }

                is SurveyEffect.HideLoading -> {
                    // 로딩 숨김
                }

                is SurveyEffect.ShowError -> {
                    // 에러 표시 (예: Snackbar)
                }

                is SurveyEffect.SurveyCompleted -> {
                    // 설문 완료 처리 - ProgressBar가 100%로 채워진 후 처리
                    // TODO: 메인 화면으로 이동하거나 완료 화면 표시
                }

                is SurveyEffect.ExitSurvey -> {
                    // SurveyPage 종료 처리 (예: 네비게이션)
                }
            }
        }
        viewModel.clearEffects()
    }

    // 페이지 상태 동기화
    LaunchedEffect(state.currentPage) {
        pagerState.animateScrollToPage(page = state.currentPage)
    }

    BackHandler(enabled = true, onBack = {
        viewModel.processIntent(SurveyIntent.HandleBackPress)
    })

    Column(modifier = modifier.fillMaxSize().background(color = White)) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                "${state.currentPage + 1}/5",
                style = TextStyle(color = Black, fontSize = 16.sp, fontFamily = AppFont())
            )
            ProgressBar(
                progress = if (state.isCompleted) 1.0f else state.currentPage / 5f
            )
        }

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize(),
            userScrollEnabled = false // 스크롤 비활성화
        ) { page ->
            when (page) {
                0 -> GenderSelectScreen(
                    selectedGender = state.gender,
                    onIntent = viewModel::processIntent
                )

                1 -> HeightInputScreen(
                    height = state.height,
                    onIntent = viewModel::processIntent
                )

                2 -> WeightInputScreen(
                    weight = state.weight,
                    onIntent = viewModel::processIntent
                )

                3 -> BodyTypeScreen(
                    bodyType = state.bodyType,
                    onIntent = viewModel::processIntent
                )

                4 -> StylePreferenceScreen(
                    selectedStyles = state.preferredStyles,
                    onIntent = viewModel::processIntent
                )
            }
        }

        // 로딩 상태 표시
        if (state.isLoading) {
            LinearProgressIndicator(
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}