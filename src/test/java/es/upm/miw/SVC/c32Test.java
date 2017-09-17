package es.upm.miw.SVC;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class c32Test {
    private c32 Obj;
    @Before
    public void Before() {
        Obj = new c32();
    }
    @Test
    public void testMA() {
        assertEquals("mA",Obj.mA());
    }

}
