package ai.alda.carinfo.test

import ai.alda.carinfo.nice.side.adapter.output.NiceFeignClientAdapter
import ai.alda.carinfo.test.feign.TestFeign
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
class TestRestController (
    private val testFeign : TestFeign,
    private val niceFeignClientController: NiceFeignClientAdapter
) {

    @GetMapping("/nicetest")
    @ResponseStatus(HttpStatus.OK)
    fun niceFeignTest(

    ):String? {
        return niceFeignClientController.getCarInfoData(
            name = "TEST",
            vehicleNumber = "test",
        )
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    fun getServiceName(

    ):String {
        return "Car info"
    }

}