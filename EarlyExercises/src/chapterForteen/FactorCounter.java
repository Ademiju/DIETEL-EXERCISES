package chapterForteen;

public class FactorCounter {
    public static void main(String[] args) {
        numberOfFactor(100);
    }
    public static void numberOfFactor(int numberToCheck){
        int factorCount = 2;
        for(int number = 2; number <= numberToCheck/2; number++ ){
            if(numberToCheck % number == 0){
                factorCount++;
            }
        }
        System.out.printf("The number of factors of %d is %d",numberToCheck,factorCount);
    }
}
