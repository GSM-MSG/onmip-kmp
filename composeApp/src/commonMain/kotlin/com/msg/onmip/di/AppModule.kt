package com.msg.onmip.di

import com.msg.onmip.feature.survey.viewmodel.SurveyViewModel
import com.msg.onmip.shared.repository.SurveyRepository
import com.msg.onmip.shared.repository.SurveyRepositoryImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.dsl.module

val appModule = module {
    // Repository
    single<SurveyRepository> { SurveyRepositoryImpl() }
    
    // CoroutineScope
    single { CoroutineScope(SupervisorJob() + Dispatchers.Main) }
    
    // ViewModels
    factory { SurveyViewModel(get(), get()) }
} 