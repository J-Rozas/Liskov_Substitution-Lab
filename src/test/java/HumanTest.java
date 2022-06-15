import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    private Human human;

    @Before
    public void before() {
        human = new Human("Hum");
    }

    @Test
    public void shouldBeAbleToWalk(){
        assertEquals("I can walk", human.walk());
    }

    @Test
    public void shouldBeAbleToEat() {
        assertEquals("Yup, I am eating", human.eat());
    }

    @Test
    public void shouldBeAbleToBreath() {
        assertEquals("I am breathing just fine", human.breathe());
    }

    @Test
    public void shouldBeAbleToTalk() {
        assertEquals("I am saying words", human.talk());
    }

}
