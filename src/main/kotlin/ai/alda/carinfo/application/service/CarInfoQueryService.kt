package ai.alda.carinfo.application.service

import ai.alda.carinfo.application.api.side.port.ApiServicePort
import ai.alda.carinfo.application.request.side.port.CarInfoQueryUseCase
import org.springframework.stereotype.Service

/**
 * 포트와 포트를 연결하는 메인 work service
 * BusinessLogic
 */
@Service
class CarInfoQueryService (
    private val apiServicePort: ApiServicePort,

): CarInfoQueryUseCase {


}