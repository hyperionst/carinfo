package ai.alda.carinfo.application.domain

data class AldaRequest(
    var requestID : Long,
    var name: String,
    var vehicleNumber : String
)