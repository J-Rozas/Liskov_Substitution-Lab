import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    private Mammal mammal;

    @Before
    public void before() {
        mammal = new Mammal();
    }

    @Test
    public void shouldBeAbleToTalk() {
        assertEquals("I am saying words", mammal.talk());
    }
}
