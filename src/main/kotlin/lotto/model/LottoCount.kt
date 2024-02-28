package lotto.model

class LottoCount(private val purchasableLottoCount: Int, val manualLottoCount: Int) {
    val autoLottoCount = purchasableLottoCount - manualLottoCount

    init {
        validateManualLottoCount()
    }

    private fun validateManualLottoCount() {
        require(manualLottoCount in MIN_MANUAL_LOTTO_COUNT..purchasableLottoCount) {
            ERROR_MANUAL_LOTTO_COUNT
        }
    }

    companion object {
        private const val MIN_MANUAL_LOTTO_COUNT = 0
        private const val ERROR_PREFIX = "[ERROR] "
        private const val ERROR_MANUAL_LOTTO_COUNT = "${ERROR_PREFIX}수동으로 구매할 로또 수는 구매 가능한 로또 수보다 작거나 같아야 합니다."
    }
}