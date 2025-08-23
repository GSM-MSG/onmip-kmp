package com.msg.onmip.di

import com.msg.onmip.feature.survey.viewmodel.SurveyViewModel
import com.msg.onmip.shared.repository.SurveyRepository
import com.msg.onmip.shared.repository.SurveyRepositoryImpl
import org.koin.dsl.module

val appModule = module {
    // Repository
    single<SurveyRepository> { SurveyRepositoryImpl() }
    
    // ViewModels
    factory { SurveyViewModel(get()) }
} 