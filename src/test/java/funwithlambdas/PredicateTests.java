package funwithlambdas;

import org.junit.Test;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class PredicateTests {

    @Test
    public void _01_negate_a_predicate() {
        Predicate<String> emptyPredicate = s -> s.isEmpty();
        Predicate<String> notEmptyPredicate = null; //TODO

        assertThat(notEmptyPredicate.test("")).isFalse();
        assertThat(notEmptyPredicate.test("xyz")).isTrue();
    }

    @Test
    public void _02_combining_predicates() {
        Predicate<String> notNullPredicate = s -> s != null;
        Predicate<String> notEmptyPredicate = s -> !s.isEmpty();

        Predicate<String> notNullAndNotEmptyPredicate = null; // TODO

        assertThat(notNullAndNotEmptyPredicate.test("")).isFalse();
        assertThat(notNullAndNotEmptyPredicate.test(null)).isFalse();
        assertThat(notNullAndNotEmptyPredicate.test("shekhar")).isTrue();
    }

    // TODO: Show how Predicate is implemented as well
}
