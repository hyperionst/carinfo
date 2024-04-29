package ai.alda.carinfo.application.api.side.port

import ai.alda.carinfo.nice.side.adapter.output.dto.NiceCarInfoResponse

/**
 * ## api요청 관련 데이터 처리
 * -
 */
interface ApiServicePort {
    fun getCarInfoData(name: String, vehicleNumber: String) : NiceCarInfoResponse
    fun getHeathState() : String?
}