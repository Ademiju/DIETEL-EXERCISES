package chapterTwo;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int firstNumber = input.nextInt();
        System.out.println("Enter an integer");
        int secondNumber = input.nextInt();
        System.out.println("Enter an integer");
        int thirdNumber = input.nextInt();
        System.out.println("Enter an integer");
        int fourthNumber = input.nextInt();
        System.out.println("Enter an integer");
        int fifthNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                if (firstNumber > fourthNumber) {
                    if (firstNumber > fifthNumber) {

                        System.out.println(firstNumber + " is the largest number");
                    }
                }
            }
        }
        if (secondNumber > firstNumber) {
            if (secondNumber > thirdNumber) {
                if (secondNumber > fourthNumber) {
                    if (secondNumber > fifthNumber) {

                        System.out.println(secondNumber + " is the largest number");
                    }
                }
            }
        }
        if (thirdNumber > firstNumber) {
            if (thirdNumber > secondNumber) {
                if (thirdNumber > fourthNumber) {
                    if (thirdNumber > fifthNumber) {

                        System.out.println(thirdNumber + " is the largest number");
                    }
                }
            }
        }

        if (fourthNumber > firstNumber) {
            if (fourthNumber > secondNumber) {
                if (fourthNumber > thirdNumber) {
                    if (fourthNumber > fifthNumber) {

                        System.out.println(fourthNumber + " is the largest number");
                    }
                }
            }
        }

        if (fifthNumber > firstNumber) {
            if (fifthNumber > secondNumber) {
                if (fifthNumber > thirdNumber) {
                    if (fifthNumber > fourthNumber) {

                        System.out.println(fifthNumber + " is the largest number");
                    }
                }
            }
        }

        if (firstNumber < secondNumber) {
            if (firstNumber < thirdNumber) {
                if (firstNumber < fourthNumber) {
                    if (firstNumber < fifthNumber) {

                        System.out.println(firstNumber + " is the smallest number");
                    }
                }
            }
        }

        if (secondNumber < firstNumber) {
            if (secondNumber < thirdNumber) {
                if (secondNumber < fourthNumber) {
                    if (secondNumber < fifthNumber) {

                        System.out.println(secondNumber + " is the smallest number");
                    }
                }
            }
        }

        if (thirdNumber < firstNumber) {
            if (thirdNumber < secondNumber) {
                if (thirdNumber < fourthNumber) {
                    if (thirdNumber < fifthNumber) {

                        System.out.println(thirdNumber + " is the smallest number");
                    }
                }
            }
        }
        if (fourthNumber < firstNumber) {
            if (fourthNumber < secondNumber) {
                if (fourthNumber < thirdNumber) {
                    if (fourthNumber < fifthNumber) {

                        System.out.println(fourthNumber + " is the smallest number");
                    }
                }
            }
        }

        if (fifthNumber < firstNumber) {
            if (fifthNumber < secondNumber) {
                if (fifthNumber < thirdNumber) {
                    if (fifthNumber < fourthNumber) {

                        System.out.println(fifthNumber + " is the smallest number");
                    }
                }
            }
        }
    }
}
