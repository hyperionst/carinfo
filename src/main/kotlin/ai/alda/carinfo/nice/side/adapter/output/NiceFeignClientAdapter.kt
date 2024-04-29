package ai.alda.carinfo.nice.side.adapter.output

import ai.alda.carinfo.application.api.side.port.ApiServicePort
import ai.alda.carinfo.nice.side.adapter.output.dto.NiceCarInfoResponse
import ai.alda.carinfo.nice.side.adapter.output.dto.RegistrationAndPriceRequest
import ai.alda.carinfo.nice.side.adapter.output.feign.NiceFeignClient
import org.springframework.stereotype.Component

@Component
class NiceFeignClientAdapter(
    private val niceFeignClient: NiceFeignClient
) : ApiServicePort
{

    override fun getCarInfoData(name: String, vehicleNumber: String): NiceCarInfoResponse {
        val registrationAndPriceRequest = RegistrationAndPriceRequest(
            apiKey = "6EE487FFF4DA81CF639B0A69D2B5BEAD",
            chkSec = "20240101120000",
            chkKey = "567",
            loginId = "Wink",
            kindOf = "66",
            ownerNm = name,
            vhrNo = vehicleNumber,
        )
        return niceFeignClient.postRegistrationAndPrice(registrationAndPriceRequest)
    }



    override fun getHeathState(): String? {
        return niceFeignClient.getNiceHealthState()
    }


}