package ai.alda.carinfo.nice.side.adapter.output.dto


/**
 * ## Nice Api 자동차 등록원부 및  제원 시세 정보 조회
 * - api kindof = 66 으로 고정해야한다.
 * - https://niceab.nicednr.co.kr/carInfos
 * - 대상 차량의 자동차 등록원부 및 제원 및 시세에 대한 정보를 조회한다.
 */
data class NiceRegistrationAndPriceRequest(
    val apiKey : String,
    val chkSec : String,
    val chkKey : String,
    val loginId : String,
    val kindOf : String = "66",
    val ownerNm : String,
    val vhrNo : String,
)



/**
 * ## Nice Api 헬스체크
 * - api kindof = 100 으로 고정해야한다
 * - https://niceab.nicednr.co.kr/carInfos
 * - 자동차 등록원보 조회 대상기관의 장애 여부를 판단할 수 있다.
 */
data class NiceHealthCheckRequest(
    val apiKey : String,
    val chkSec : String,
    val chkKey : String,
    val loginId : String,
    val kindOf : String = "100",
)

