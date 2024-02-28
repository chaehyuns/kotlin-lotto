package lotto.model

class LottoNumberGenerator : NumberGenerator {
    override fun generate(
        size: Int,
        minNumber: Int,
        maxNumber: Int,
    ): Lotto = Lotto.lottoNumbersOf((minNumber..maxNumber).shuffled().take(size).sorted())
}