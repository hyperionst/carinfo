package ai.alda.carinfo.nice.side.adapter.output.dto

data class HealthStatusResponse(
    val resultCode: String,
    val monitor: Monitor,
    val resultMsg: String,
)

data class Monitor(
    val code: String,
)
