package ai.alda.carinfo.nice.side.adapter.output.dto


data class NiceCarInfoResponse(
    val carSise: CarSise?,
    val carParts: CarParts?,
    val resultCode: String,
    val resultMsg: String,
)

data class CarSise(
    val amcRsltCode: String,
    val resultCode: String,
    val processImprtyResnCode: String,
    val amcRsltMsg: String,
    val info: Info,
    val resultMsg: String,
)

data class Info(
    val carinfo: Carinfo,
)

data class Carinfo(
    val carClassMakerImg: String,
    val makerNm: String,
    val modelId: String,
    val fuel: String,
    val classModelImg: String,
    val usedCarPriceMedian: String,
    val importYn: String,
    val engineType: String,
    val classModelId: String,
    val shapeCategory: String,
    val amcRsltCode: String,
    val makerId: String,
    val salePrice: String,
    val usedCarPriceMean: String,
    val modelNm: String,
    val amcRsltMsg: String,
    val yearType: String,
    val ciyYearType: String,
    val classModelNm: String,
    val gradeList: List<GradeList>,
    val engineSize: String,
    val prye: String,
    val gearBox: String,
    val formNm: String,
    val vinNum: String,
    val seatingCapacity: String,
)

data class GradeList(
    val grade1yearLaterPrice: String,
    val gradeId: String,
    val grade2yearLaterPrice: String,
    val gradeNm: String,
    val recommGradeYn: String,
    val mileageRatio: String,
    val gradeUsedCarPrice: String,
    val grade4yearLaterPrice: String,
    val treadb: String,
    val treadf: String,
    val wheelbase: String,
    val price: String,
    val trvlDstncPriceList: List<TrvlDstncPriceList>,
    val grade3yearLaterPrice: String,
    val tireSizeFront: String,
    val grade5yearLaterPrice: String,
    val tireSizeBack: String,
)

data class TrvlDstncPriceList(
    val trvlDstnc: String,
    val trvl3yearLaterPrice: String,
    val trvlDstncPrice: String,
    val trvl1yearLaterPrice: String,
    val trvl2yearLaterPrice: String,
)

data class CarParts(
    val outB0001: OutB0001,
    val outB7001: OutB7001,
    val processImprtyResnCode: String,
)

data class OutB7001(
    val list: List<ListB7001>,
)

data class ListB7001(
    val resValidPeriod: String,
    val resCarNo: String,
    val resMakingDate: String,
    val resLastTradeDt: String,
    val resCarModelType: String,
    val resUserIdentiyNo: String,
    val resSourceType: String,
    val resValidDistance: String,
    val vhrNo: String,
    val formKind: String,
    val resUseHistBiz: String,
    val resFirstDate: String,
    val resDocNo: String,
    val resGarage: String,
    val resClosingDate: String,
    val resDocType: String,
    val resUseHistRent: String,
    val resUseHistYn: String,
    val resCancellationDate: String,
    val seq: String,
    val resColor: String,
    val inquiryCd: String,
    val resUseHistGov: String,
    val resUseType: String,
    val resContentsList: List<ResContentsList>,
    val resSpecControlNo: String,
    val resConfirmDate: String,
    val predDistance: String,
    val commCarName: String,
    val ownerNm: String,
    val resFinalOwner: String,
    val resNumber: String,
    val commCarOption: String,
    val resVehicleIdNo: String,
    val resMotorType: String,
    val resValidEndDt: String,
    val resDate: String,
    val resCarYearModel: String,
    val resValidStartDt: String,
)

data class ResContentsList(
    val resSubRegNo: String,
    val resContents: String,
    val preResVhrNo: String,
    val jobNo: String,
    val resUserIdentiyNo: String,
    val resRegisterDate: String,
    val resMainRegNo: String,
    val resReceiptNo: String,
    val vhrNo: String,
    val seq: String,
    val inquiryCd: String,
    val formKind: String,
)


data class OutB0001(
    val list: List<ListB0001>,
)

data class ListB0001(
    val resValidPeriod: String,
    val resCarNo: String,
    val resMakingDate: String,
    val resLastTradeDt: String,
    val resCarModelType: String,
    val resUserIdentiyNo: String,
    val resSourceType: String,
    val resValidDistance: String,
    val vhrNo: String,
    val formKind: String,
    val resUseHistBiz: String,
    val resFirstDate: String,
    val resDocNo: String,
    val resGarage: String,
    val resClosingDate: String,
    val resDocType: String,
    val resUseHistRent: String,
    val resUseHistYn: String,
    val resCancellationDate: String,
    val seq: String,
    val resColor: String,
    val inquiryCd: String,
    val resUseHistGov: String,
    val resUseType: String,
    val resContentsList: List<ResContentsList2>,
    val resSpecControlNo: String,
    val resConfirmDate: String,
    val predDistance: String,
    val commCarName: String,
    val ownerNm: String,
    val resFinalOwner: String,
    val resNumber: String,
    val commCarOption: String,
    val resVehicleIdNo: String,
    val resMotorType: String,
    val resValidEndDt: String,
    val resDate: String,
    val resCarYearModel: String,
    val resValidStartDt: String,
)
data class ResContentsList2(
    val resSubRegNo: String,
    val resContents: String,
    val preResVhrNo: String,
    val jobNo: String,
    val resUserIdentiyNo: String,
    val resRegisterDate: String,
    val resMainRegNo: String,
    val resReceiptNo: String,
    val vhrNo: String,
    val seq: String,
    val inquiryCd: String,
    val formKind: String,
)
