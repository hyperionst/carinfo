package ai.alda.carinfo.alda.side.adapter.output.persistance

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


/**
 * ## alda.finance로 전달하기 위한 도메인
 * - nice 에서 받아온 받아온 원부, 시세 정보에서 필요한 데이터만 받아서 구성한다.
 * - 2024.04.26기준임. 변경예정
 */
@Deprecated("도메인 새로 생성")
@Document(collection = "finance_old")
data class FinanceDomain_old(
    @Id
    val vehicleNumber : String,
    //관리용데이터
    val name : String,

    //여기 아래로부터는 finance로 넘겨주는 데이터가 되어야한다.
//    val registrationInventories : List<RegistrationInventory>,
//    val gradeList : List<Grade>,
    val majorResultCode : String?,
    val minorResultCode : String?

)

/**
 * ## 등록원부 리스트
 * - 만약 내용이 전부 같은 거라면 List에서 1개만 유지 할예정 'List(0)'
 */
data class RegistrationInventory(
    val sequence : String,
    val formKind : String,
    val vehicleNumber : String,
    val deRegistrationDate : String,
    val vehicleName : String,
    val vehicleModelType : String,
    val vehicleIdNumber : String,
    val ownership : String,
    val modelYear : String,
    val color : String,
    val sourceType : String,
    val firstDate : String,
    val makingDate : String,
    val lastTradeDate : String,
    val finalOwner : String,
    val distance : String,
    val contentsList: List<Contents>,
)

/**
 * ## 사항란
 * - 실제 등록원부 5개씩 끊어저서 등록되어있다.
 */
data class Contents(
    val formKind : String,
    val distance : String,
    val category : String,
    val seizRequestDate : String,
    val userIdentityNumber : String,
    val detail : String,
    val makerName : String,
    val classModeName : String,
    val classModelImageUrl : String,
    val engineSize : String,
    val engineType : String,
    val fuel : String,
)

/**
 * ## 등급리스트
 */
data class Grade(
    val name : String,
    val price : String,
    val usedVehiclePrice : String,
    val drivingDistancePriceList : List<DrivingDistancePrice>,
)


/**
 * ## 주행거리별 시세
 */
data class DrivingDistancePrice(
    val distance : String,
    val distancePrice : String,
)
