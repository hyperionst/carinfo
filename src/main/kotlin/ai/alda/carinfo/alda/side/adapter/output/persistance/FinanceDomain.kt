package ai.alda.carinfo.alda.side.adapter.output.persistance

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


/**
 * ## alda.finance로 전달하기 위한 도메인
 * - nice 에서 받아온 받아온 원부, 시세 정보에서 필요한 데이터만 받아서 구성한다.
 * - 2024.04.26기준임. 변경예정
 */
@Document(collection = "finance")
data class FinanceDomain(

    //관리용데이터
    @Id
    val id : String,
    val name : String,
    val vehicleNumber : String,

    //여기 아래로부터는 finance로 넘겨주는 데이터가 되어야한다.
    val registrationInventoryList: List<RegistrationInventory>
    //TODO: .... Create other members

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
    val contentsList: List<Contents>
    //TODO: .... Create other members
)

/**
 * ## 사항란
 * - 실제 등록원부 5개씩 끊어저서 등록되어있다.
 */
data class Contents(
    val formKind : String,
    //TODO: .... Create other members

)