package chapterSix;

public class TableOfBinaryOctalAndHexadecimalNumbers {
    public static void main(String[] args) {
        int number = 5;
        int result = number/2-1;
        while(result != 0){
           int dividened = result%2;
            System.out.print(dividened + " ");
        }
    }
}
