package chapterNine;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArrayListTest {
    MyArrayList arrayList;
    @Before
    public void setUp() {
        arrayList = new MyArrayList();
    }
    @Test
    public void myListCreatedIsEmptyTest(){
        assertNotNull(arrayList);
        assertTrue(arrayList.isEmpty());
    }
    @Test
    public  void addItem_ListIsNotEmptyTest(){
        arrayList.add("Item");
        assertFalse(arrayList.isEmpty());
    }
    @Test
    public void addItem_removeItem_listIsEmpty(){
        arrayList.add("Item");
        arrayList.remove("Item");
        assertTrue(arrayList.isEmpty());

    }
    @Test
    public void addItem_sizeIsOneTest(){
        arrayList.add("Item");
        assertEquals(1, arrayList.size());
    }
    @Test
    public void addTwoItem_sizeIsTwoTest(){
        arrayList.add("Item");
        arrayList.add("Item");
        assertEquals(2, arrayList.size());
    }

    @Test
    public void addTwoItems_removeOne_ListNotEmptyTest(){
        arrayList.add("Item");
        arrayList.add("Item");
        arrayList.remove("Item");
        assertFalse(arrayList.isEmpty());

    }
    @Test
    public void addThreeItems_removeOne_SizeIsTwoTest(){
        arrayList.add("Item");
        arrayList.add("Item");
        arrayList.add("Item");
        arrayList.remove("Item");
        assertEquals(2,arrayList.size());

    }
    @Test
    public void addTwoItems_removeTwo_ListNotEmptyTest(){
        arrayList.add("Item");
        arrayList.add("Item");
        arrayList.remove("Item");
        arrayList.remove("Item");
        assertTrue(arrayList.isEmpty());
    }
    @Test
    public void  addItem_getItemAtIndex_ReturnsItemTest(){
        arrayList.add("Item");
        arrayList.add("Basket");
        String gottenItem = arrayList.get(1);
        assertEquals("Basket", gottenItem);
    }
    @Test
    public void  addItem_getItemAtBothIndex_ReturnsItemTest(){
        arrayList.add("Item");
        arrayList.add("Basket");;
        assertEquals("Basket",arrayList.get(1) );
    }
    @Test
    public void  addItem_Capacity_ReturnsItemTest(){
        assertEquals(5, arrayList.capacity());
        arrayList.add("Item");
        arrayList.add("Basket");
        arrayList.add("Food");
        arrayList.add("Food");
        arrayList.add("Food");
        arrayList.add("Umbrella");
        assertEquals(10,arrayList.capacity() );
    }
    @Test
    public void  addThreeItem_removeThirdItem_elementAt2isNullTest(){
        arrayList.add("Item");
        arrayList.add("Basket");
        arrayList.add("Food");
        arrayList.remove(2);
        assertEquals(null, arrayList.get(2));
    }
    @Test
    public void  addThreeItem_removeSecondItem_elementAt1isElementAt2Test(){
        arrayList.add("Item");
        arrayList.add("Basket");
        arrayList.add("Food");
        arrayList.remove(0);
        assertEquals("Food", arrayList.get(1));
    }
    @Test
    public void  addThreeItem_removeItemByName_ItemIndexIsNullTest(){
        arrayList.add("Item");
        arrayList.add("Basket");
        arrayList.add("Food");
        arrayList.remove("Basket");
        assertEquals("Food", arrayList.get(1));
    }
    @Test
    public void  removeItemThatDoesntExist_ThrowExceptionTest(){
        try{
            arrayList.remove("Boxers");
        }catch(Exception ex){
            assertEquals("Element does not exist", ex.getMessage());
//            assertEquals(IllegalArgumentException.class,ex.getClass());
        }
    }

}
