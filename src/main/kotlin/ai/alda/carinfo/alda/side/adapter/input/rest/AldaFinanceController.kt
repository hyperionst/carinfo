package ai.alda.carinfo.alda.side.adapter.input.rest

import ai.alda.carinfo.application.api.side.port.ApiServicePort
import ai.alda.carinfo.alda.side.adapter.input.rest.domain.AldaRequest
import ai.alda.carinfo.application.request.side.port.CarInfoQueryUseCase
import org.springframework.web.bind.annotation.*


/**
 * - Alda Finance에서 들어오는 요청 또는 Alda Front에서 들어오는 요청처리
 */
@RestController
class AldaFinanceController(
    private val carInfoQueryUseCase: CarInfoQueryUseCase,
)  {


    @PostMapping("/finance/carinfo")
    fun requestQueryCarInfo(
        @RequestBody request: AldaRequest,
    ): String? {
        return carInfoQueryUseCase.requestQueryCarInfo(
            name = request.name,
            vehicleNumber = request.vehicleNumber,
        )
    }

    @GetMapping("/finance/carinfo")
    fun getCarInfoData(
        @RequestParam name: String,
        @RequestParam vehicleNumber: String
    ): String? {
        //TODO : 임의로 생성한 데이터값을 전달한다.
        return carInfoQueryUseCase.requestGetCarInfo(
            name = name,
            vehicleNumber = vehicleNumber,
        )
    }

}