package lotto.model

import lotto.controller.LottoController.Companion.PURCHASE_UNIT

class PurchaseAmount(inputAmount: Int, private val ticketPrice: Int = PURCHASE_UNIT) {
    val purchasableLottoCount = inputAmount / ticketPrice
    val lottoPurchaseAmount = purchasableLottoCount * ticketPrice

    init {
        validateNumberRange(inputAmount)
    }

    private fun validateNumberRange(amount: Int) {
        require(amount >= ticketPrice) { ERROR_NUMBER_RANGE_MESSAGE }
    }

    companion object {
        private const val ERROR_PREFIX = "[ERROR] "
        private const val ERROR_NUMBER_RANGE_MESSAGE = "${ERROR_PREFIX}${PURCHASE_UNIT}원 이상의 값만 입력 가능합니다."
    }
}