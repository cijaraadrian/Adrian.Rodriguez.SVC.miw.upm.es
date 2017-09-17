package es.upm.miw.SVC;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class c21Test {
    private c21 Obj;
    @Before
    public void Before() {
        Obj = new c21();
    }
    @Test
    public void testM1() {
        assertEquals("m1",Obj.m1());
    }

    @Test
    public void testM2() {
        assertEquals("m2",Obj.m2());
    }

}
