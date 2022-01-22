package chapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverloadedConstructorTest {
    @Test
    public void iCanUseOverloadedConstructorTest(){
        OverloadedConstructor beverage = new OverloadedConstructor(2,5);
        assertEquals(2,beverage.getCocoaQty());
        assertEquals(5,beverage.getMilkQty());
        assertEquals(0, beverage.getSugarQty());
    }
    @Test
    public void iCanUseOverloadedConstructorTest2(){
        OverloadedConstructor beverage = new OverloadedConstructor(5);
        assertEquals(0,beverage.getCocoaQty());
        assertEquals(5,beverage.getMilkQty());
        assertEquals(0,beverage.getSugarQty());
    }

}