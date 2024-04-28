package ai.alda.carinfo.test.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@FeignClient( name="test", url = "http://localhost:30000")
interface TestFeign {

    @RequestMapping(method = [RequestMethod.GET], value = ["/test2"])
    fun getStores(): String?

}