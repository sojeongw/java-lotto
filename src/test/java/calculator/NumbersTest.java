package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class NumbersTest {

    @Test
    @DisplayName("주어진 숫자를 분리하고 합계를 구한다")
    void shouldCreate() {
        Numbers numbers = new Numbers("1,3:6");
        numbers.sum();

        assertThat(numbers.result()).isEqualTo(10);
    }

    @Test
    @DisplayName("주어진 숫자를 분리하고 합계를 구한다")
    void shouldSumNumbers() {
        Numbers numbers = new Numbers(Arrays.asList(new Number("1"), new Number("2")));
        numbers.sum();

        assertThat(numbers.result()).isEqualTo(3);
    }
}