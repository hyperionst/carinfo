package ai.alda.carinfo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients


@EnableFeignClients
@SpringBootApplication
class CarinfoQueryServiceApplication

fun main(args: Array<String>) {
	runApplication<CarinfoQueryServiceApplication>(*args)
}
