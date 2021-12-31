package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Cata1Test {


    @Test
    public void aGradeCanBeCalculatedTest() {

        assertEquals('A',Cata.calculateGrade(98));

    }

    @Test
    public void bGradeCanBeCalculatedTest() {
        char result = Cata.calculateGrade(85);
        assertEquals('B', result);
    }

    @Test
    public void cGradeCanBeCalculatedTest() {
        char myResult = Cata.calculateGrade(78);
        assertEquals('C', myResult);
    }

    @Test
    public void dGradeCanBeCalculatedTest() {
        char myResult = Cata.calculateGrade(63);
        assertEquals('D', myResult);
    }

    @Test
    public void fGradeCanBeCalculatedTest() {
        char myResult = Cata.calculateGrade(50);
        assertEquals('F', myResult);

    }


    @Test
    public void testForPriceAt2000() {
        Cata priceCheck = new Cata();
        int finalPrice = priceCheck.testForQuantityAgainstPrice(4, 2000);
        assertEquals(8000, finalPrice);

    }

    @Test
    public void testForPriceAt1800() {
        Cata priceCheck = new Cata();
        int finalPrice = priceCheck.testForQuantityAgainstPrice(8, 1800);
        assertEquals(14400, finalPrice);
    }

    @Test
    public void testForPriceAt1600() {
        Cata priceCheck = new Cata();
        int finalPrice = priceCheck.testForQuantityAgainstPrice(10, 1600);
        assertEquals(16000, finalPrice);
    }


    @Test
    public void testForPriceAt1500() {
        Cata priceCheck = new Cata();
        int finalPrice = priceCheck.testForQuantityAgainstPrice(40, 1500);
        assertEquals(60000, finalPrice);


    }

    @Test
    public void testForPriceAt1300() {
        Cata priceCheck = new Cata();
        int finalPrice = priceCheck.testForQuantityAgainstPrice(50, 1300);
        assertEquals(65000, finalPrice);

    }

    @Test
    public void testForPriceAt1200() {
        Cata priceCheck = new Cata();
        int finalPrice = priceCheck.testForQuantityAgainstPrice(100, 1200);
        assertEquals(120000, finalPrice);
    }

    @Test
    public void testForPriceAt1100() {
        Cata priceCheck = new Cata();
        int finalPrice = priceCheck.testForQuantityAgainstPrice(200, 1100);
        assertEquals(220000, finalPrice);
    }

    @Test
    public void testForPriceAt1000() {
        Cata priceCheck = new Cata();
        int finalPrice = priceCheck.testForQuantityAgainstPrice(500, 1000);
        assertEquals(500000, finalPrice);
    }

    @Test
    public void arraysTotalCanBeCalculatedTest(){
        int [] numbers = {1, 2, 3, 4, 5};
        int result = Cata1.calculateTotalOf(numbers);
        assertEquals(15, result);
    }
    @Test
    public void arraysMinimumCanBeCalculatedTest(){
        int [] numbers = {1, 2, 3, 4, 5};
        int result = Cata1.calculateMinimumOf(numbers);
        assertEquals(1, result);

    }
//
    @Test
    public void arraysMaximumCanBeCalculatedTest(){
        int [] numbers = {1, 2, 3, 4, 5};
        int result = Cata1.calculateMaximumOf(numbers);
        assertEquals(5, result);
    }

    @Test
    public void arraysAverageCanBeCalculatedTest() {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = Cata1.calculateAverageOf(numbers);
        assertEquals(3.0, result);

    }
        @Test
        public void minOfMaxTest(){
            int[] numbers = {1, 2, 3, 4, 5};
            int result = Cata1.calculateOneLessMinOf(numbers);
                assertEquals(10,result);
    }

    @Test
    public void maxOfMinTest(){
        int[] numbers = {1, 2, 3, 4, 5};
        int result = Cata1.calculateOneLessMaxOf(numbers);
        assertEquals(14,result);
    }
}