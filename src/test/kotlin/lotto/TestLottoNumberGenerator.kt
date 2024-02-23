package lotto

import lotto.model.LottoNumbers
import lotto.model.NumberGenerator

class TestLottoNumberGenerator : NumberGenerator {
    override fun generate() = LottoNumbers.lottoNumbersOf(1, 2, 3, 4, 5, 6)
}
