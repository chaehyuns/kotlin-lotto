package lotto.model

class WinningLotto(val winningNumbers: Lotto, val bonusNumber: LottoNumber) {
    init {
        require(!winningNumbers.getMatchBonus(bonusNumber)) {
            ERROR_BONUS_DUPLICATE
        }
    }

    companion object {
        const val ERROR_BONUS_DUPLICATE = "보너스 번호는 당첨 번호와 중복될 수 없습니다."
    }
}