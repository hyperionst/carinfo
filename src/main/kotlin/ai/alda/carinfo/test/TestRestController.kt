package ai.alda.carinfo.test

import ai.alda.carinfo.alda.side.adapter.output.persistance.FinanceDomain
import ai.alda.carinfo.alda.side.adapter.output.persistance.FinanceDomainAdapter
import ai.alda.carinfo.nice.side.adapter.output.NiceFeignClientAdapter
import ai.alda.carinfo.nice.side.adapter.output.dto.HealthStatusResponse
import ai.alda.carinfo.nice.side.adapter.output.dto.NiceCarInfoResponse
import ai.alda.carinfo.test.feign.TestFeign
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@RestController
class TestRestController (
    private val testFeign : TestFeign,
    private val niceFeignClientController: NiceFeignClientAdapter,
    private val financeDomainAdapter: FinanceDomainAdapter,
) {

    @GetMapping("/test/feign/carinfo")
    @ResponseStatus(HttpStatus.OK)
    fun niceFeignTest(
        @RequestParam name: String,
        @RequestParam vn: String,
    ):NiceCarInfoResponse {
        return niceFeignClientController.getCarInfoData(
            name = name,
            vehicleNumber = vn,
        )
    }


    @GetMapping("/test/feign/health")
    @ResponseStatus(HttpStatus.OK)
    fun niceHealthCheckTest():HealthStatusResponse {
        return niceFeignClientController.getHeathState()
    }


//    @GetMapping("/test/db/save")
//    @ResponseStatus(HttpStatus.OK)
//    fun getSave(
//        @RequestParam name: String,
//        @RequestParam vn: String,
//    ): String {
//
//        val financeDomain = FinanceDomain(
//            name = "테스트",
//            vehicleNumber = "12가3456",
//        )
//        financeDomainAdapter.saveFinanceDomain(financeDomain)
//        return "Saved";
//    }


    @GetMapping("/test/db/load/")
    @ResponseStatus(HttpStatus.OK)
    fun getlaod(
        @RequestParam name: String,
        @RequestParam vn: String
    ): FinanceDomain? {
        return financeDomainAdapter.loadFinanceDomain(name, vn)
    }



    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    fun getServiceName(

    ):String {
        return "Car info"
    }

}