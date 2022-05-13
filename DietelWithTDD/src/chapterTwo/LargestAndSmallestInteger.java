package chapterTwo;

public class LargestAndSmallestInteger {

    public static int largestOfFiveIntegers(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
       if(firstNumber > secondNumber) {
           if(firstNumber > thirdNumber){
               if (firstNumber > fourthNumber){
                   if (firstNumber > fifthNumber){
                       return firstNumber;
                   }
               }
           }
       }
        if(secondNumber > firstNumber) {
            if(secondNumber > thirdNumber){
                if (secondNumber > fourthNumber){
                    if (secondNumber > fifthNumber){
                        return secondNumber;
                    }
                }
            }
        }
        if(thirdNumber > firstNumber) {
            if(thirdNumber > secondNumber){
                if (thirdNumber > fourthNumber){
                    if (thirdNumber > fifthNumber){
                        return thirdNumber;
                    }
                }
            }
        }
        if(fourthNumber > firstNumber) {
            if(fourthNumber > secondNumber){
                if (fourthNumber > thirdNumber){
                    if (fourthNumber > fifthNumber){
                        return fourthNumber;
                    }
                }
            }
        }
        if(fifthNumber > firstNumber) {
            if(fifthNumber > secondNumber){
                if (fifthNumber > thirdNumber){
                    if (fifthNumber > fourthNumber){
                        return fifthNumber;
                    }
                }
            }
        }
        return 0;
    }

    public static int smallestOfFiveIntegers(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        if(firstNumber < secondNumber) {
            if(firstNumber < thirdNumber){
                if (firstNumber < fourthNumber){
                    if (firstNumber < fifthNumber){
                        return firstNumber;
                    }
                }
            }
        }
        if(secondNumber < firstNumber) {
            if(secondNumber < thirdNumber){
                if (secondNumber < fourthNumber){
                    if (secondNumber < fifthNumber){
                        return secondNumber;
                    }
                }
            }
        }
        if(thirdNumber < firstNumber) {
            if(thirdNumber < secondNumber){
                if (thirdNumber < fourthNumber){
                    if (thirdNumber < fifthNumber){
                        return thirdNumber;
                    }
                }
            }
        }
        if(fourthNumber < firstNumber) {
            if(fourthNumber < secondNumber){
                if (fourthNumber < thirdNumber){
                    if (fourthNumber < fifthNumber){
                        return fourthNumber;
                    }
                }
            }
        }
        if(fifthNumber < firstNumber) {
            if(fifthNumber < secondNumber){
                if (fifthNumber < thirdNumber){
                    if (fifthNumber < fourthNumber){
                        return fifthNumber;
                    }
                }
            }
        }

        return 0;
    }
}
