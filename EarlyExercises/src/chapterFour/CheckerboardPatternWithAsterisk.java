package chapterFour;

public class CheckerboardPatternWithAsterisk {
    public static void main(String[] args) {
        int count = 1;
        while(count <= 8){
            if(count%2!=0){
                int counter =0;
                while(counter < 7) {
                    System.out.print("* ");
                    counter++;
                }

                System.out.print("* ");
                System.out.println();
                }else{
                int counter =0;
                while(counter < 7) {
                    System.out.print(" ");
                    System.out.print("*");
                    counter++;
            }
                System.out.print(" ");
                System.out.print("* ");
                System.out.println();



            }
            count++;

        }
        System.out.println();
        System.out.println();
        int row = 1;
        while(row <= 8){
            if(row%2==0){
                System.out.print(" ");
                System.out.print("* ");
            }else {
                System.out.print("* ");
            }
            int column = 0;
            while(column < 7){
                System.out.print("* ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
