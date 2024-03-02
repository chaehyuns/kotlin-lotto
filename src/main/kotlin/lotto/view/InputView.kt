package lotto.view

class InputView {
    fun readPurchaseAmount(): String = validateNullInput(readlnOrNull())

    fun readManualLottoCount(): String = validateNullInput(readlnOrNull())

    fun readManualLottoNumbers(): List<String> = validateNullInput(readlnOrNull()).replace(" ", "").split(SPLIT_DELIMITER).map(String::trim)

    fun readWinningNumbers(): List<String> {
        val winningNumbers = validateNullInput(readlnOrNull()).replace(" ", "")
        return winningNumbers.split(SPLIT_DELIMITER).map { it }
    }

    fun readWinningBonusNumber(): String = validateNullInput(readlnOrNull())

    private fun validateNullInput(input: String?): String {
        return input ?: throw IllegalArgumentException(ERROR_EMPTY_INPUT_MESSAGE)
    }

    companion object {
        private const val SPLIT_DELIMITER = ","
        private const val ERROR_PREFIX = "[ERROR] "
        private const val ERROR_EMPTY_INPUT_MESSAGE = "${ERROR_PREFIX}입력값이 없습니다."
    }
}
