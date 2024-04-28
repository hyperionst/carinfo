package ai.alda.carinfo.config

import feign.Client
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier


@Configuration
class FeignConfig {
//    @Bean
//    fun feignClient(): Client {
//        return Client.Default(null, getDefaultHostnameVerifier())
//    }
}