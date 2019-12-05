package funwithlambdas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;

public class ConsumerTests {

    @Test
    public void _01_consumer_should_clear_the_list() {
        Consumer<List<Integer>> consumer = null; // TODO
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        consumer.accept(numbers);
        assertThat(numbers).isEmpty();
    }

    @Test
    public void _02_consumer_that_calls_two_consumers() {
        Consumer<List<Integer>> c1 = xs -> xs.add(4);
        Consumer<List<Integer>> c2 = xs -> xs.add(5);

        Consumer<List<Integer>> c3 = null; // TODO

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));

        c3.accept(numbers);

        assertThat(numbers).containsExactly(1, 2, 3, 4, 5);

    }

    // TODO: Show how Consumer is implemented as well

}


