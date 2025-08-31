package com.msg.onmip.shared.repository

import com.msg.onmip.shared.model.SurveyData

interface SurveyRepository {
    suspend fun submitSurvey(surveyData: SurveyData): Result<Unit>
}

class SurveyRepositoryImpl : SurveyRepository {
    override suspend fun submitSurvey(surveyData: SurveyData): Result<Unit> {
        return try {
            // TODO: 실제 API 호출 구현
            // 예시: apiService.submitSurvey(surveyData)
            kotlinx.coroutines.delay(1000) // API 호출 시뮬레이션
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
} 