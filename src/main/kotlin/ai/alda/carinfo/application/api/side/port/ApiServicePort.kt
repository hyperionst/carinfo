package ai.alda.carinfo.application.api.side.port

import ai.alda.carinfo.alda.side.adapter.output.persistance.FinanceDomain


/**
 * ## api요청 관련 데이터 처리
 * -
 */
interface ApiServicePort {
    fun getCarInfoData(name: String, vehicleNumber: String) : String?
    fun getHeathState() : String?
}