package es.upm.miw.SVC;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class c22Test {
    private c22 Obj;
    @Before
    public void Before() {
        Obj = new c22();
    }
    @Test
    public void testMA() {
        assertEquals("mA",Obj.mA());
    }

}
