//package ai.alda.carinfo

package ai.alda.carinfo.alda.side.adapter.output.persistance

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class FinanceDomainAdapterTest @Autowired constructor(
    private val financeDomainRepository: FinanceDomainRepository,
    private val financeDomainAdapter: FinanceDomainAdapter
) {
    @Test
    fun `should save finance domain correctly`() {
        val name="테스트"
        val vehicleNumber = "12사3456"

        val financeDomain = FinanceDomain(
            name = name,
            vehicleNumber = vehicleNumber,
//            gradeList = ArrayList(),
//            registrationInventories = ArrayList(),
            majorResultCode = "",
            minorResultCode = "",
        )
        financeDomainAdapter.saveFinanceDomain(financeDomain)

        val foundFinanceDomain = financeDomainRepository.findFirstByNameAndVehicleNumber(name, vehicleNumber)
        assertEquals(financeDomain, foundFinanceDomain)
    }

    @Test
    fun `should load finance domain correctly`() {
        val name="테스트"
        val vehicleNumber = "12사3456"

        val financeDomain = FinanceDomain(
            name = name,
            vehicleNumber = vehicleNumber,
//            gradeList = ArrayList(),
//            registrationInventories = ArrayList(),
            majorResultCode = "",
            minorResultCode = ""
        )
        financeDomainRepository.save(financeDomain)

        val foundFinanceDomain = financeDomainAdapter.loadFinanceDomain(name, vehicleNumber)
        assertNotNull(foundFinanceDomain)
        assertEquals(name, foundFinanceDomain?.name)
        assertEquals(vehicleNumber, foundFinanceDomain?.vehicleNumber)
    }

}