import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    private Animal animal;

    @Before
    public void before() {
        animal = new Animal();
    }

    @Test
    public void shouldBeAbleToEat() {
        assertEquals("Yup, I am eating", animal.eat());
    }

    @Test
    public void shouldBeAbleToBreath() {
        assertEquals("I am breathing just fine", animal.breathe());
    }
}
