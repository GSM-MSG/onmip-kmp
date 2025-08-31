package com.msg.onmip.feature.survey.model

enum class PreferredStyle(val text: String) {
    // 캐주얼 계열
    CASUAL("캐주얼"),
    SPORTY("스포티"),
    STREET("스트릿"),
    MINIMAL("미니멀"),
    
    // 클래식 계열
    CLASSIC("클래식"),
    FORMAL("포멀"),
    BUSINESS("비즈니스"),
    PREPPY("프레피"),
    
    // 트렌디 계열
    MODERN("모던"),
    CONTEMPORARY("컨템포러리"),
    AVANT_GARDE("아방가르드"),
    HIGH_FASHION("하이패션"),
    
    // 로맨틱 계열
    ROMANTIC("로맨틱"),
    FEMININE("페미닌"),
    SOFT("소프트"),
    ELEGANT("우아한"),
    
    // 빈티지 계열
    VINTAGE("빈티지"),
    RETRO("레트로"),
    NATURAL("내추럴"),
    BOHEMIAN("보헤미안"),
    
    // 액티브 계열
    OUTDOOR("아웃도어"),
    CAMPING("캠핑"),
    ATHLETIC("운동복")
}