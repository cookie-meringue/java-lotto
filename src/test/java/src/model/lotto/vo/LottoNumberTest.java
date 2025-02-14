package src.model.lotto.vo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static src.model.lotto.vo.LottoNumber.MAX;
import static src.model.lotto.vo.LottoNumber.MIN;

import org.junit.jupiter.api.Test;

class LottoNumberTest {

    @Test
    void 로또_번호가_1부터_45사이가_아니면_예외_발생() {
        assertThrows(IllegalArgumentException.class, () -> LottoNumber.from(MIN - 1));
        assertThrows(IllegalArgumentException.class, () -> LottoNumber.from(MAX + 1));
    }
}