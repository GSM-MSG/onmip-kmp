package com.msg.onmip.shared.ui.theme.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import onmip.composeapp.generated.resources.Pretendard_Black
import onmip.composeapp.generated.resources.Pretendard_Bold
import onmip.composeapp.generated.resources.Pretendard_ExtraBold
import onmip.composeapp.generated.resources.Pretendard_Light
import onmip.composeapp.generated.resources.Pretendard_Medium
import onmip.composeapp.generated.resources.Pretendard_Regular
import onmip.composeapp.generated.resources.Pretendard_SemiBold
import onmip.composeapp.generated.resources.Pretendard_Thin
import onmip.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun AppFont(): FontFamily {
    val pretendard = FontFamily(
        Font(Res.font.Pretendard_Bold, FontWeight.Bold),
        Font(Res.font.Pretendard_ExtraBold, FontWeight.ExtraBold),
        Font(Res.font.Pretendard_Black, FontWeight.Black),
        Font(Res.font.Pretendard_Thin, FontWeight.Thin),
        Font(Res.font.Pretendard_Light, FontWeight.Light),
        Font(Res.font.Pretendard_Medium, FontWeight.Medium),
        Font(Res.font.Pretendard_Regular, FontWeight.Normal),
        Font(Res.font.Pretendard_SemiBold, FontWeight.SemiBold),
    )
    return pretendard
}