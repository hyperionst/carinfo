package ai.alda.carinfo.alda.side.adapter.output.persistance

import ai.alda.carinfo.application.api.side.port.ApiServicePort
import ai.alda.carinfo.application.persistence.side.port.FinancePort
import org.springframework.stereotype.Repository

@Repository
class FinanceDomainAdapter(

    private val financeDomainRepository: FinanceDomainRepository,

    ) : FinancePort {


    override fun saveFinanceDomain(financeDomain: FinanceDomain) {
        financeDomainRepository.save(financeDomain)
    }

    override fun loadFinanceDomain(name: String, vehicleNumber: String): FinanceDomain {
        TODO("Not yet implemented")
    }


}