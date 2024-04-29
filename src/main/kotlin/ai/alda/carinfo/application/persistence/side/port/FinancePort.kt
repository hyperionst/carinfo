package ai.alda.carinfo.application.persistence.side.port

import ai.alda.carinfo.alda.side.adapter.output.persistance.FinanceDomain
import ai.alda.carinfo.application.api.side.port.ApiServicePort
import org.springframework.stereotype.Service



interface FinancePort {
    fun saveFinanceDomain(financeDomain: FinanceDomain)
    fun loadFinanceDomain(name: String, vehicleNumber: String) : FinanceDomain?
}