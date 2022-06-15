import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChimpanzeeTest {

    private Chimpanzee chimpanzee;

    @Before
    public void before() {
        chimpanzee = new Chimpanzee("Chimp");
    }

    @Test
    public void shouldBeAbleToWalk(){
        assertEquals("I can walk", chimpanzee.walk());
    }

    @Test
    public void shouldBeAbleToEat() {
        assertEquals("Yup, I am eating", chimpanzee.eat());
    }

    @Test
    public void shouldBeAbleToBreath() {
        assertEquals("I am breathing just fine", chimpanzee.breathe());
    }

    @Test
    public void shouldBeAbleToTalk() {
        assertEquals("I am saying words", chimpanzee.talk());
    }
}
