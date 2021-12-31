package chapterFive;

public class OddNumberAdd {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 1 and 99: ");
       int oddSum = 0;
        for(int number = 1; number <= 99; number++){
            if(number % 2 != 0){
                oddSum +=number;
                System.out.print(number+" ");
            }

        }
        System.out.println();
        System.out.println("The sum of all odd numbers from 1 to 99 is: "+oddSum);

        int i =1;
    while(i <=20){
        System.out.print(i);
        if(i % 5 == 0){
            System.out.println();
        }else{
            System.out.print("\t");
        }

        i++;
    }

        System.out.println();
    for(int j = 1; j<=20; j++){
        System.out.print(j+"\t");
        if(j % 5 == 0){
            System.out.println();
        }


    }
        for (int k = 1; k < 3; k++) {
            for (int j = 1; j < 5; j++) {
                System.out.print('*');
            }
            System.out.println("\n#####");
        }

    }

}
