package ChapterTwo;

public class Printer {
    public static void main(String[] args) {
        /* 2.14. Write an application that displays the numbers 1 to 4 on the same line,
        with each pair of adjacent numbers separated by one space. Use the following techniques:
        a) Use one System.out.println statement.

        ANSWER:*/
        System.out.println("1 2 3 4");

       /* b) Use four System.out.print statements.

        ANSWER:*/

        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("4 ");
        System.out.println(" ");
       /* c) Use one System.out.printf statement.

        ANSWER:*/

        System.out.printf("%d %d %d %d", 1 , 2 , 3 , 4);
    }
}
