package chapterThree;

public class PatternPrint3 {

    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            int p =1;
            for (int j = i; j <=1; j++) {
                System.out.print("");
            }
            for(int j = i; j<= 1; j++){
                System.out.print(p++ +" ");
            }
            System.out.println();



        }
    }
}
   