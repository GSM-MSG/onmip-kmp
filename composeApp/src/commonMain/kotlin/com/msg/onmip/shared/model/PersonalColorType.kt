package com.msg.onmip.shared.model

/**
 * 퍼스널 컬러 16타입을 나타내는 enum 클래스
 * 유이레 컬러에서 사용한 16타입 체계를 따름
 */
enum class PersonalColorType(
    val displayName: String,
    val season: String,
    val brightness: String,
    val saturation: String,
    val temperature: String,
    val blueGray: String,
    val fluorescent: String,
    val contrast: String,
    val bestColors: String,
    val notes: String
) {
    /**
     * 봄클리어 (Spring Clear)
     * - 명도: 중저명도~극고명도
     * - 채도: 고채도
     * - 온도: 웜~쿨
     * - 청탁: 청○, 탁X
     * - 형광기 소화도: 형광기○
     * - 대비감: 상~중상
     * - 베스트 컬러: 빨간색
     * - 주의사항: 8타입/12타입 분류에서 봄브라이트로 분류, 여름라이트로 오진나는 경우 많음
     */
    SPRING_CLEAR(
        displayName = "봄클리어",
        season = "봄",
        brightness = "중저명도~극고명도",
        saturation = "고채도",
        temperature = "웜~쿨",
        blueGray = "청○, 탁X",
        fluorescent = "형광기○",
        contrast = "상~중상",
        bestColors = "빨간색",
        notes = "8타입/12타입 분류: 봄브라이트, 여름라이트로 오진나는 경우 많음"
    ),

    /**
     * 봄트루 (Spring True)
     * - 명도: 중고명도~고명도
     * - 채도: 중채도~고채도
     * - 온도: 극웜~미지근웜
     * - 청탁: 청O, 탁△
     * - 형광기 소화도: 형광기○
     * - 대비감: 중상~중
     * - 베스트 컬러: 주황색
     * - 주의사항: 8타입/12타입 분류에서 봄브라이트로 분류
     */
    SPRING_TRUE(
        displayName = "봄트루",
        season = "봄",
        brightness = "중고명도~고명도",
        saturation = "중채도~고채도",
        temperature = "극웜~미지근웜",
        blueGray = "청O, 탁△",
        fluorescent = "형광기○",
        contrast = "중상~중",
        bestColors = "주황색",
        notes = "8타입/12타입 분류: 봄브라이트"
    ),

    /**
     * 봄라이트 (Spring Light)
     * - 명도: 고명도
     * - 채도: 저채도~중고채도
     * - 온도: 웜~미지근쿨
     * - 청탁: 청○, 탁x
     * - 형광기 소화도: 형광기○
     * - 대비감: 중~중하
     * - 베스트 컬러: 노란색
     */
    SPRING_LIGHT(
        displayName = "봄라이트",
        season = "봄",
        brightness = "고명도",
        saturation = "저채도~중고채도",
        temperature = "웜~미지근쿨",
        blueGray = "청○, 탁x",
        fluorescent = "형광기○",
        contrast = "중~중하",
        bestColors = "노란색",
        notes = ""
    ),

    /**
     * 봄소프트 (Spring Soft)
     * - 명도: 중고명도~고명도
     * - 채도: 저채도~중저채도
     * - 온도: 웜~미지근쿨
     * - 청탁: 청○, 탁○
     * - 형광기 소화도: 형광기x
     * - 대비감: 중~중하
     * - 베스트 컬러: 분홍색
     * - 주의사항: 8타입/12타입 분류에서 봄라이트 베스트, 가을뮤트 세컨드, 여름라이트로 오진나는 경우 많음
     */
    SPRING_SOFT(
        displayName = "봄소프트",
        season = "봄",
        brightness = "중고명도~고명도",
        saturation = "저채도~중저채도",
        temperature = "웜~미지근쿨",
        blueGray = "청○, 탁○",
        fluorescent = "형광기x",
        contrast = "중~중하",
        bestColors = "분홍색",
        notes = "8타입/12타입 분류: 봄라이트 베스트 가을뮤트 세컨드, 여름라이트로 오진나는 경우 많음"
    ),

    /**
     * 여름라이트 (Summer Light)
     * - 명도: 고명도
     * - 채도: 중저채도~저채도
     * - 온도: 쿨~미지근웜
     * - 청탁: 청○, 탁△
     * - 형광기 소화도: 형광기○
     * - 대비감: 중~중하
     * - 베스트 컬러: 하늘색
     * - 주의사항: 봄라이트로 오진나는 경우 많음 (극단적인 쿨톤의 색보단 미지근한 웜톤의 색이 베스트)
     */
    SUMMER_LIGHT(
        displayName = "여름라이트",
        season = "여름",
        brightness = "고명도",
        saturation = "중저채도~저채도",
        temperature = "쿨~미지근웜",
        blueGray = "청○, 탁△",
        fluorescent = "형광기○",
        contrast = "중~중하",
        bestColors = "하늘색",
        notes = "봄라이트로 오진나는 경우 많음 (극단적인 쿨톤의 색보단 미지근한 웜톤의 색이 베스트)"
    ),

    /**
     * 여름라이트 밀키 (Summer Light Milky)
     * - 명도: 고명도
     * - 채도: 중저채도~저채도
     * - 온도: 쿨~미지근웜
     * - 청탁: 청△, 탁△
     * - 형광기 소화도: 형광기x
     * - 대비감: 중~중하
     * - 베스트 컬러: 하늘색 (밀키 버전)
     */
    SUMMER_LIGHT_MILKY(
        displayName = "여름라이트 밀키",
        season = "여름",
        brightness = "고명도",
        saturation = "중저채도~저채도",
        temperature = "쿨~미지근웜",
        blueGray = "청△, 탁△",
        fluorescent = "형광기x",
        contrast = "중~중하",
        bestColors = "하늘색 (밀키 버전)",
        notes = ""
    ),

    /**
     * 여름트루 (Summer True)
     * - 명도: 중저명도~고명도
     * - 채도: 중저채도~중고채도
     * - 온도: 극쿨~미지근쿨
     * - 청탁: 청○, 탁△
     * - 형광기 소화도: 형광기○
     * - 대비감: 상~중
     * - 베스트 컬러: 파란색
     * - 주의사항: 8타입/12타입 분류에서 여름라이트/여름브라이트, 여름라이트 베스트 겨울딥/겨울브라이트 세컨드, 봄라이트로 오진나는 경우 많음 (코랄 메이크업 가능)
     */
    SUMMER_TRUE(
        displayName = "여름트루",
        season = "여름",
        brightness = "중저명도~고명도",
        saturation = "중저채도~중고채도",
        temperature = "극쿨~미지근쿨",
        blueGray = "청○, 탁△",
        fluorescent = "형광기○",
        contrast = "상~중",
        bestColors = "파란색",
        notes = "8타입/12타입 분류: 여름라이트/여름브라이트, 여름라이트 베스트 겨울딥/겨울브라이트 세컨드, 봄라이트로 오진나는 경우 많음 (코랄 메이크업 가능)"
    ),

    /**
     * 여름소프트 (Summer Soft)
     * - 명도: 중저명도~중고명도
     * - 채도: 저채도~중저채도
     * - 온도: 쿨~미지근웜
     * - 청탁: 청x, 탁○
     * - 형광기 소화도: 형광기×
     * - 대비감: 중~중하
     * - 베스트 컬러: 회색
     */
    SUMMER_SOFT(
        displayName = "여름소프트",
        season = "여름",
        brightness = "중저명도~중고명도",
        saturation = "저채도~중저채도",
        temperature = "쿨~미지근웜",
        blueGray = "청x, 탁○",
        fluorescent = "형광기×",
        contrast = "중~중하",
        bestColors = "회색",
        notes = ""
    ),

    /**
     * 여름딥 (Summer Deep)
     * - 명도: 저명도~중고명도
     * - 채도: 저채도~중채도
     * - 온도: 미지근쿨~미지근웜
     * - 청탁: 청△, 탁○
     * - 형광기 소화도: 형광기×
     * - 대비감: 상~중
     * - 베스트 컬러: 보라색
     * - 주의사항: 8타입/12타입 분류에서 저명도 여름뮤트/저채도 겨울딥
     */
    SUMMER_DEEP(
        displayName = "여름딥",
        season = "여름",
        brightness = "저명도~중고명도",
        saturation = "저채도~중채도",
        temperature = "미지근쿨~미지근웜",
        blueGray = "청△, 탁○",
        fluorescent = "형광기×",
        contrast = "상~중",
        bestColors = "보라색",
        notes = "8타입/12타입 분류: 저명도 여름뮤트/저채도 겨울딥"
    ),

    /**
     * 가을소프트 (Autumn Soft)
     * - 명도: 중저명도~중고명도
     * - 채도: 저채도~중저채도
     * - 온도: 웜~미지근쿨
     * - 청탁: 청×, 탁○
     * - 형광기 소화도: 형광기×
     * - 대비감: 중하~하
     * - 베스트 컬러: 회색
     */
    AUTUMN_SOFT(
        displayName = "가을소프트",
        season = "가을",
        brightness = "중저명도~중고명도",
        saturation = "저채도~중저채도",
        temperature = "웜~미지근쿨",
        blueGray = "청×, 탁○",
        fluorescent = "형광기×",
        contrast = "중하~하",
        bestColors = "회색",
        notes = ""
    ),

    /**
     * 가을트루 (Autumn True)
     * - 명도: 중저명도~중고명도
     * - 채도: 중저채도~중고채도
     * - 온도: 극웜~미지근웜
     * - 청탁: 청△, 탁○
     * - 형광기 소화도: 형광기×
     * - 대비감: 중상~중
     * - 베스트 컬러: 카키색
     * - 주의사항: 8타입/12타입 분류에서 가을스트롱
     */
    AUTUMN_TRUE(
        displayName = "가을트루",
        season = "가을",
        brightness = "중저명도~중고명도",
        saturation = "중저채도~중고채도",
        temperature = "극웜~미지근웜",
        blueGray = "청△, 탁○",
        fluorescent = "형광기×",
        contrast = "중상~중",
        bestColors = "카키색",
        notes = "8타입/12타입 분류: 가을스트롱"
    ),

    /**
     * 가을딥 (Autumn Deep)
     * - 명도: 저명도~중고명도
     * - 채도: 저채도~중고채도
     * - 온도: 웜~미지근쿨
     * - 청탁: 청△, 탁○
     * - 형광기 소화도: 형광기×
     * - 대비감: 상~중상
     * - 베스트 컬러: 갈색
     */
    AUTUMN_DEEP(
        displayName = "가을딥",
        season = "가을",
        brightness = "저명도~중고명도",
        saturation = "저채도~중고채도",
        temperature = "웜~미지근쿨",
        blueGray = "청△, 탁○",
        fluorescent = "형광기×",
        contrast = "상~중상",
        bestColors = "갈색",
        notes = ""
    ),

    /**
     * 가을라이트 (Autumn Light)
     * - 명도: 중저명도~고명도
     * - 채도: 저채도~중저채도
     * - 온도: 웜~미지근쿨
     * - 청탁: 청△, 탁○
     * - 형광기 소화도: 형광기×
     * - 대비감: 중~중하
     * - 베스트 컬러: 노란색
     * - 주의사항: 8타입/12타입 분류에서 라이트그레이시 베스트 가을뮤트, 여름라이트로 오진나는 경우 많음
     */
    AUTUMN_LIGHT(
        displayName = "가을라이트",
        season = "가을",
        brightness = "중저명도~고명도",
        saturation = "저채도~중저채도",
        temperature = "웜~미지근쿨",
        blueGray = "청△, 탁○",
        fluorescent = "형광기×",
        contrast = "중~중하",
        bestColors = "노란색",
        notes = "8타입/12타입 분류: 라이트그레이시 베스트 가을뮤트, 여름라이트로 오진나는 경우 많음"
    ),

    /**
     * 겨울딥 (Winter Deep)
     * - 명도: 저명도~중저명도/극고명도
     * - 채도: 저채도~중고채도
     * - 온도: 쿨~미지근웜
     * - 청탁: 청○, 탁△
     * - 형광기 소화도: 형광기×
     * - 대비감: 극상~중상
     * - 베스트 컬러: 검은색
     */
    WINTER_DEEP(
        displayName = "겨울딥",
        season = "겨울",
        brightness = "저명도~중저명도/극고명도",
        saturation = "저채도~중고채도",
        temperature = "쿨~미지근웜",
        blueGray = "청○, 탁△",
        fluorescent = "형광기×",
        contrast = "극상~중상",
        bestColors = "검은색",
        notes = ""
    ),

    /**
     * 겨울트루 (Winter True)
     * - 명도: 저명도~중저명도/극고명도
     * - 채도: 중고채도~고채도
     * - 온도: 극쿨~미지근쿨
     * - 청탁: 청○, 탁x
     * - 형광기 소화도: 형광기△
     * - 대비감: 극상~중상
     * - 베스트 컬러: 남색
     * - 주의사항: 8타입/12타입 분류에서 겨울브라이트
     */
    WINTER_TRUE(
        displayName = "겨울트루",
        season = "겨울",
        brightness = "저명도~중저명도/극고명도",
        saturation = "중고채도~고채도",
        temperature = "극쿨~미지근쿨",
        blueGray = "청○, 탁x",
        fluorescent = "형광기△",
        contrast = "극상~중상",
        bestColors = "남색",
        notes = "8타입/12타입 분류: 겨울브라이트"
    ),

    /**
     * 겨울클리어 (Winter Clear)
     * - 명도: 저명도~중고명도/극고명도
     * - 채도: 중채도~고채도
     * - 온도: 쿨~미지근웜
     * - 청탁: 청○, 탁x
     * - 형광기 소화도: 형광기○
     * - 대비감: 극상~중상
     * - 베스트 컬러: 보라색
     * - 주의사항: 8타입/12타입 분류에서 겨울브라이트
     */
    WINTER_CLEAR(
        displayName = "겨울클리어",
        season = "겨울",
        brightness = "저명도~중고명도/극고명도",
        saturation = "중채도~고채도",
        temperature = "쿨~미지근웜",
        blueGray = "청○, 탁x",
        fluorescent = "형광기○",
        contrast = "극상~중상",
        bestColors = "보라색",
        notes = "8타입/12타입 분류: 겨울브라이트"
    ),

    /**
     * 겨울소프트 (Winter Soft)
     * - 명도: 저명도~중고명도/극고명도
     * - 채도: 저채도~중고채도
     * - 온도: 쿨~미지근웜
     * - 청탁: 청O, 탁○
     * - 형광기 소화도: 형광기×
     * - 대비감: 상~중상
     * - 베스트 컬러: 하늘색
     * - 주의사항: 8타입/12타입 분류에서 겨울브라이트+여름 뮤트컬러 서브로 활용/여름뮤트+대비감 필수, 가을소프트로 오진나는 경우 많음 (mlbb 베스트), 형광하늘색이 겨울타입 전체 베스트
     */
    WINTER_SOFT(
        displayName = "겨울소프트",
        season = "겨울",
        brightness = "저명도~중고명도/극고명도",
        saturation = "저채도~중고채도",
        temperature = "쿨~미지근웜",
        blueGray = "청O, 탁○",
        fluorescent = "형광기×",
        contrast = "상~중상",
        bestColors = "하늘색",
        notes = "8타입/12타입 분류: 겨울브라이트+여름 뮤트컬러 서브로 활용/여름뮤트+대비감 필수, 가을소프트로 오진나는 경우 많음 (mlbb 베스트)"
    );

    /**
     * 계절별 퍼스널 컬러 타입을 조회하는 함수
     * @param season 조회할 계절 (봄, 여름, 가을, 겨울)
     * @return 해당 계절의 퍼스널 컬러 타입 리스트
     */
    fun getBySeason(season: String): List<PersonalColorType> {
        return values().filter { it.season == season }
    }

    /**
     * 특정 타입의 베스트 컬러를 조회하는 함수
     * @param type 조회할 퍼스널 컬러 타입
     * @return 해당 타입의 베스트 컬러 문자열
     */
    fun getBestColors(type: PersonalColorType): String {
        return type.bestColors
    }
}
