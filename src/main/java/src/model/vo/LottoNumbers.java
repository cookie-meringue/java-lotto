package src.model.vo;

import java.util.List;
import src.model.generator.NumberGenerator;

public class LottoNumbers {

    private final List<LottoNumber> values;

    private LottoNumbers(List<Integer> values) {
        this.values = values.stream().map(LottoNumber::from).toList();
    }

    public static LottoNumbers generateFrom(NumberGenerator numberGenerator, int size) {
        return new LottoNumbers(
                numberGenerator.generate(LottoNumber.MIN_NUMBER_RANGE, LottoNumber.MAX_NUMBER_RANGE, size));
    }

    @Override
    public String toString() {
        return "LottoNumbers{" +
                "values=" + values +
                '}';
    }
}
