package lotto.domain.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinningLottoNumbers {
    private static final String SPLIT_TEXT = ", ";

    private final List<LottoNumber> lottoNumbers;

    public WinningLottoNumbers(final String winningNumbers) {
        this.lottoNumbers = Arrays.stream(winningNumbers.split(SPLIT_TEXT))
                .map(number -> new LottoNumber(Integer.parseInt(number)))
                .collect(Collectors.toList());
    }

    public boolean isContain(final LottoNumber lottoNumber) {
        return lottoNumbers.contains(lottoNumber);
    }

    public List<LottoNumber> getLottoNumbers() {
        return lottoNumbers;
    }
}