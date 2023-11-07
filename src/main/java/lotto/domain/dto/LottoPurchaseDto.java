package lotto.domain.dto;

import java.util.List;
import lotto.domain.LottoList;
import lotto.domain.LottoNumber;
import lotto.domain.Money;

public class LottoPurchaseDto {
    private final LottoList lottoList;
    private final List<LottoNumber> winningNumbers;
    private final LottoNumber bonusNumber;

    private LottoPurchaseDto(LottoList lottoList, List<LottoNumber> winningNumbers, LottoNumber bonusNumber) {
        this.lottoList = lottoList;
        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }

    public static LottoPurchaseDto Of(LottoList lottoList, List<LottoNumber> winningNumbers, LottoNumber bonusNumber) {
        return new LottoPurchaseDto(lottoList, winningNumbers, bonusNumber);
    }

    public int getCost() {
        return lottoList.size() * Money.EACH_LOTTO;
    }

    public LottoList getLottoList() {
        return lottoList;
    }

    public List<LottoNumber> getWinningNumbers() {
        return winningNumbers;
    }

    public LottoNumber getBonusNumber() {
        return bonusNumber;
    }
}
