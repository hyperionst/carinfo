package ai.alda.carinfo.alda.side.adapter.output.persistance

import org.springframework.data.mongodb.repository.MongoRepository

interface FinanceDomainRepository : MongoRepository<FinanceDomain, String>{
    fun findFirstByNameAndVehicleNumber(name: String, vehicleNumber: String): FinanceDomain?
}


