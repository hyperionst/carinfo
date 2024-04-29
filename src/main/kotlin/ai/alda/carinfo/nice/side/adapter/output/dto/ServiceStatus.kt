package ai.alda.carinfo.nice.side.adapter.output.dto

enum class ServiceStatus(val description: String, val value: String) {
    WHITE("정상", "White"),
    YELLOW("일부 조회 지연 현상 발생 중", "Yellow"),
    ORANGE("서비스 장애 판단 가능", "Orange"),
    RED("서비스 장애", "Red"),
    BLACK("서비스 지속 장애", "Black")
}