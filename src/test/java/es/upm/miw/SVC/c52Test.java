package es.upm.miw.SVC;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class c52Test {
    private c52 Obj;
    @Before
    public void Before() {
        Obj = new c52();
    }
    @Test
    public void testMA() {
        assertEquals("mA",Obj.mA());
    }

}
