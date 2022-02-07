package LadyList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LadyListCreationTest {
LadyListCreation myArray;
    @BeforeEach
    public void SetUpTest() {
        myArray = new LadyListCreation(10);
    }
    @Test
    public void arrayCanBeCreatedWithSpecifiedLengthTest(){

        assertEquals(10,myArray.getLength());
    }
    @Test
    public void arrayCreatedHasNullValueTest(){
        assertEquals("[null, null, null, null, null, null, null, null, null, null]",Arrays.toString(myArray.getLists()));

    }
    @Test
    public void elementsCanBeAddedToTheCreatedArrayTest(){
        myArray.add("Clothes");
        myArray.add("Wigs");
        assertEquals("[Clothes, Wigs, null, null, null, null, null, null, null, null]",Arrays.toString(myArray.getLists()));

    }
    @Test
    public void sizeOfCreatedArrayCanBeGottenTest() {
        assertEquals(0, myArray.getSize());
        myArray.add("Food");
        myArray.add("Cake");
        myArray.add("Fruits");
        assertEquals(3, myArray.getSize());
    }
    @Test
    public void lengthOfArrayWillDoubleWhenInitialLengthIsReachedTest(){
        myArray.add("Clothes");
        myArray.add("Wigs");
        myArray.add("Food");
        myArray.add("Cake");
        myArray.add("Fruits");
        myArray.add("Umbrella");
        myArray.add("Diary");
        myArray.add("Cup");
        myArray.add("FryingPan");
        myArray.add("Pots");
        myArray.add("Iron");
        myArray.add("Earrings");
        myArray.add("Make-Up Kit");
        assertEquals(13, myArray.getSize());
        assertEquals(20,myArray.getLength());
    }
    @Test
    public void elementsCanBeAddedByIndexTest() {
        myArray.add(1, "Clothes");
        myArray.add(4, "Fruits");
        myArray.add(6, "Food");
        assertEquals("[null, Clothes, null, null, Fruits, null, Food, null, null, null]", Arrays.toString(myArray.getLists()));
    }
    @Test
    public void elementsCanBeRemovedByIndexTest(){
        myArray.add(1, "Clothes");
        myArray.add(4, "Fruits");
        myArray.add(6,"Food");
        assertEquals("[null, Clothes, null, null, Fruits, null, Food, null, null, null]",Arrays.toString(myArray.getLists()));
        myArray.remove(1);
        assertEquals("[null, null, null, null, Fruits, null, Food, null, null, null]",Arrays.toString(myArray.getLists()));
        assertEquals(2, myArray.getSize());
        myArray.remove(6);
        assertEquals("[null, null, null, null, Fruits, null, null, null, null, null]",Arrays.toString(myArray.getLists()));
        assertEquals(1, myArray.getSize());
    }

    @Test
    public void elementsAddedCanBeRemovedFromTheArrayTest(){
        myArray.add("Clothes");
        myArray.add("Fruits");
        myArray.add("Food");
        myArray.add("Diary");
        assertEquals(4, myArray.getSize());
        assertEquals("[Clothes, Fruits, Food, Diary, null, null, null, null, null, null]",Arrays.toString(myArray.getLists()));
        myArray.remove("Clothes");
        assertEquals(3, myArray.getSize());
        assertEquals("[Fruits, Food, Diary, null, null, null, null, null, null, null]",Arrays.toString(myArray.getLists()));
        myArray.remove("Food");
        assertEquals(2, myArray.getSize());
        assertEquals("[Fruits, Diary, null, null, null, null, null, null, null, null]",Arrays.toString(myArray.getLists()));

    }

}