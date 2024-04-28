package ai.alda.carinfo.nice.side.adapter.output

import ai.alda.carinfo.application.api.side.port.ApiServicePort
import ai.alda.carinfo.nice.side.adapter.output.feign.NiceFeignClient
import org.springframework.stereotype.Component

@Component
class NiceFeignClientAdapter(
    private val niceFeignClient: NiceFeignClient
) : ApiServicePort
{

    override fun getCarInfoData(name: String, vehicleNumber: String): String? {
        return niceFeignClient.getNiceCarInfoData()
    }

    override fun getHeathState(): String? {
        return niceFeignClient.getNiceHealthState()
    }


}