package ai.alda.carinfo.nice.side.adapter.output.feign

import ai.alda.carinfo.nice.side.adapter.output.dto.HealthCheckRequest
import ai.alda.carinfo.nice.side.adapter.output.dto.HealthStatusResponse
import ai.alda.carinfo.nice.side.adapter.output.dto.NiceCarInfoResponse
import ai.alda.carinfo.nice.side.adapter.output.dto.RegistrationAndPriceRequest
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@FeignClient( name="nice", url = "https://niceab.nicednr.co.kr")
interface NiceFeignClient {

    @RequestMapping(method = [RequestMethod.POST], value = ["/carInfos"])
    fun postRegistrationAndPrice(registrationAndPriceRequest: RegistrationAndPriceRequest): NiceCarInfoResponse

    @RequestMapping(method = [RequestMethod.POST], value = ["/carInfos"])
    fun getNiceHealthState(healthCheckRequest: HealthCheckRequest): HealthStatusResponse

}