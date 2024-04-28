package ai.alda.carinfo.nice.side.adapter.output.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@FeignClient( name="nice", url = "https://niceab.nicednr.co.kr")
interface NiceFeignClient {

    //TODO: Post변경
    @RequestMapping(method = [RequestMethod.GET], value = ["/carInfos"])
    fun getNiceCarInfoData(): String?

    //TODO: Post변경
    @RequestMapping(method = [RequestMethod.GET], value = ["/carInfos"])
    fun getNiceHealthState(): String?

}