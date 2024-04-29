package ai.alda.carinfo.application.request.side.port

import org.springframework.stereotype.Service


/**
 * ## Requset Input Port
 * - (알다서비스에서)들어오는 조회 요청을 수신하여 서비스로 전달
 */
interface CarInfoQueryUseCase {
    fun requestQueryCarInfo(name: String, vehicleNumber: String) : String?
    fun requestGetCarInfo(name: String, vehicleNumber: String) : String?
}