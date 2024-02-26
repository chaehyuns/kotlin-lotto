package lotto.view

class InputView {
    fun readPurchaseAmount(): String = validateNullInput(readlnOrNull())

    fun readWinningNumbers(): String = validateNullInput(readlnOrNull()).replace(" ", "")

    fun readWinningBonusNumber(): Int {
        val bonusNumber = validateNullInput(readlnOrNull())
        try {
            return bonusNumber.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException(ERROR_INPUT_TYPE_MESSAGE)
        }
    }

    private fun validateNullInput(input: String?): String {
        return input ?: throw IllegalArgumentException(ERROR_EMPTY_INPUT_MESSAGE)
    }

    companion object {
        private const val ERROR_PREFIX = "[ERROR] "
        private const val ERROR_EMPTY_INPUT_MESSAGE = "${ERROR_PREFIX}입력값이 없습니다."
        private const val ERROR_INPUT_TYPE_MESSAGE = "${ERROR_PREFIX}숫자만 입력 가능합니다."
    }
}
