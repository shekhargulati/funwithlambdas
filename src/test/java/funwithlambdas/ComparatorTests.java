package funwithlambdas;

import funwithlambdas.model.Person;
import org.junit.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class ComparatorTests {

    @Test
    public void _01_comparing_on_multiple_attributes_before_java8() {
        Comparator<Person> comparator = null; // TODO

        Person p1 = new Person("l1", "f1", 20);
        Person p2 = new Person("l2", "f2", 20);

        assertThat(comparator.compare(p1, p2)).isLessThan(0);
    }

    @Test
    public void _02_comparing_on_multiple_attributes_in_java8() {
        Comparator<Person> comparator = null; // TODO

        Person p1 = new Person("l1", "f1", 20);
        Person p2 = new Person("l2", "f2", 20);

        assertThat(comparator.compare(p1, p2)).isLessThan(0);
    }

    //TODO: Show how Comparator are implemented
}
