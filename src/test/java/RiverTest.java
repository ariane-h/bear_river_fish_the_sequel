import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RiverTest {
    private River river;
    private Salmon salmon;

    @Before
    public void before(){
        river = new River();
        salmon = new Salmon();
    }

    @Test
    public void canAddSalmon(){
        river.addSalmon(salmon);
        assertEquals(1, river.fishCount());
    }

    @Test
    public void canRemoveSalmon(){
        river.addSalmon(salmon);
        river.removeSalmon();
        assertEquals(0, river.fishCount());
    }
}

