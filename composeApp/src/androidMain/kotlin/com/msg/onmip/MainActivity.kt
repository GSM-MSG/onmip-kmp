package com.msg.onmip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.msg.onmip.feature.main.MainScreen
import com.msg.onmip.feature.survey.SurveyPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainScreen(modifier = Modifier.safeContentPadding())
        }
    }
}


//@Preview(showSystemUi = true)
//@Composable
//fun MainScreenPreview() {
//    MainScreen()
//}

@Preview(showSystemUi = true)
@Composable
fun SurveyPagePreview() {
    SurveyPage(modifier = Modifier.safeContentPadding())
}