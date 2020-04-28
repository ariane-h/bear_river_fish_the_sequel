import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    private Bear bear;
    private Salmon salmon;
    private River river;

    @Before
    public void before(){
        bear = new Bear("Simba");
        salmon = new Salmon();
        river = new River();
        river.addSalmon(salmon);
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.bellyCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eatFromRiver(river);
        assertEquals(1, bear.bellyCount());
    }

    @Test
    public void emptyBellyAfterSleep(){
        bear.eatFromRiver(river);
        bear.sleep();
        assertEquals(0, bear.bellyCount());
    }
}
