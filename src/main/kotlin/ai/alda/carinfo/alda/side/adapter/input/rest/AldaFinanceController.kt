package ai.alda.carinfo.alda.side.adapter.input.rest

import ai.alda.carinfo.application.request.side.port.CarInfoQueryUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


/**
 * - Alda Finance에서 들어오는 요청 또는 Alda Front에서 들어오는 요청처리
 */
@RestController
class AldaFinanceController(
    private val carInfoQueryUseCase: CarInfoQueryUseCase,
) {

    @GetMapping ("/finance/test/input")
    fun testInput(): String {
        //TODO : 임의로 생성한 데이터값을 입력하도록 한다.
        return "Test Input"
    }

    @GetMapping("/finance/test/output")
    fun testOutput(): String {
        //TODO : 임의로 생성한 데이터값을 전달한다.
        return "Test Output"
    }

}