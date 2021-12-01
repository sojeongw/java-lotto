package calculator;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Numbers {
    private final List<Number> inputs;
    private int result;

    public Numbers(String input) {
        this.inputs = split(input);
        this.result = 0;
    }

    public Numbers(List<Number> numbers) {
        this.inputs = numbers;
    }

    public void sum() {
        for (Number input : inputs) {
            result += input.getValue();
        }
    }

    public int result() {
        return this.result;
    }

    private List<Number> split(String input) {
        List<String> splitInputs = StringUtils.split(input);

        return splitInputs.stream()
                .map(Number::new)
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Numbers numbers = (Numbers) o;
        return Objects.equals(inputs, numbers.inputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs);
    }
}
