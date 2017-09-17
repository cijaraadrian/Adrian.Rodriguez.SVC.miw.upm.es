package es.upm.miw.SVC;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class c12Test {
    private c12 Obj;
    @Before
    public void before() {
        Obj = new c12();
    }
    @Test
    public void testMA() {
        assertEquals("mA",Obj.mA());
    }

}
