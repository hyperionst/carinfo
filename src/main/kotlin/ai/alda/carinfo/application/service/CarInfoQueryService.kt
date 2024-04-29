package ai.alda.carinfo.application.service

import ai.alda.carinfo.application.api.side.port.ApiServicePort
import ai.alda.carinfo.application.persistence.side.port.FinancePort
import ai.alda.carinfo.application.request.side.port.CarInfoQueryUseCase
import mu.KotlinLogging
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

/**
 * 포트와 포트를 연결하는 메인 work service
 * BusinessLogic
 */
@Service
class CarInfoQueryService (
    private val financePort: FinancePort,    //persistance side
    private val apiServicePort: ApiServicePort, //api side
): CarInfoQueryUseCase {
    //TODO: Enum 추가할것
    var healthStatus : String = ""
    private val logger = KotlinLogging.logger {}

    override fun requestQueryCarInfo(name: String, vehicleNumber: String): String? {
        //TODO : Connect input PORT and output PORT


        val niceCarInfoResponse = apiServicePort.getCarInfoData(
            name=name,
            vehicleNumber = vehicleNumber
        )
        logger.info { niceCarInfoResponse.toString() }
        //suspend await으로 분기 해야 할지 모른다.
        //데이터 기존 데이터가 있는지 확인 해야한다. 있다면 id를 갱신하고 처리해야하고, 없다면 그냥 저장한다.
        return "200OK"
    }

    override fun requestGetCarInfo(name: String, vehicleNumber: String): String? {

        return financePort.loadFinanceDomain(
            name = name,
            vehicleNumber = vehicleNumber,
        ).toString()
    }


    @Scheduled(fixedRate = HEALTH_CHECK_TIME)
    fun getHealthCheck() {
        healthStatus = apiServicePort.getHeathState().let { "NOOP" }
    }



    //Static value
    companion object {
        const val HEALTH_CHECK_TIME : Long = 12000
    }

}