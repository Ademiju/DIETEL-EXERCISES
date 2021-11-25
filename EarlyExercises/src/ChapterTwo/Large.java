package ChapterTwo;

import java.util.Scanner;

public class Large {

   /* 2.24 (Largest and Smallest Integers) Write an application that reads five integers
    and determines and prints the largest and smallest integers in the group.
    Use only the programming techniques you learned in this chapter.

            ANSWER:*/

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five integers ");

        System.out.println("Enter your first integer ");
        int num1 = input.nextInt();
        System.out.println("Enter your second integer ");
        int num2 = input.nextInt();
        System.out.println("Enter your third integer ");
        int num3 = input.nextInt();
        System.out.println("Enter your fourth integer ");
        int num4 = input.nextInt();
        System.out.println("Enter your fifth integer ");
        int num5 = input.nextInt();

        if (num1 > num2){
            if (num1 > num3){
                if (num1 > num4){
                    if (num1 > num5){
                        System.out.printf("%d is the largest number ", num1);
                    }
                }
            }
        }

        if (num1<num2){
            if (num1<num3){
                if (num1<num4){
                    if (num1<num5){
                        System.out.printf("%d is the smallest number ", num1 );
                    }
                }
            }
        }

        if (num2>num1){
            if (num2>num3){
                if (num2>num4){
                    if (num2>num5){
                        System.out.printf("%d is the largest number ", num2);


                    }
                }
            }
        }

        if (num2<num1){
            if (num2<num3){
                if (num2<num4){
                    if (num2<num5){
                        System.out.printf("%d is the smallest number ", num2);
                    }
                }
            }
        }

        if (num3 > num1){
            if (num3 > num2){
                if (num3 > num4){
                    if (num3 > num5){
                        System.out.printf("%d is the largest number ", num3);
                    }
                }
            }
        }

        if (num3<num1){
            if (num3<num2){
                if (num3<num4){
                    if (num3<num5){
                        System.out.printf("%d is the smallest number ", num3 );
                    }
                }
            }
        }

        if (num4>num1){
            if (num4>num2){
                if (num4>num3){
                    if (num4>num5){
                        System.out.printf("%d is the largest number ", num4);


                    }
                }
            }
        }

        if (num4<num1){
            if (num4<num2){
                if (num4<num3){
                    if (num4<num5){
                        System.out.printf("%d is the smallest number ", num4);
                    }
                }
            }
        }

        if (num5>num1){
            if (num5>num2){
                if (num5>num3){
                    if (num5>num4){
                        System.out.printf("%d is the largest number ", num5);


                    }
                }
            }
        }

        if (num5<num1){
            if (num5<num2){
                if (num5<num3){
                    if (num5<num4){
                        System.out.printf("%d is the smallest number ", num5);
                    }
                }
            }
        }


    }


}
