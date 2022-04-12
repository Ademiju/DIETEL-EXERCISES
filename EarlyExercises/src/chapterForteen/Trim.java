package chapterForteen;

public class Trim {
    public static void main(String[] args) {
        String input = "     chair     man     ";
        String newInput = input.trim();
//        System.out.println( newInput.length());
        for(int index = 0; index < newInput.length(); index++){
            if(newInput.charAt(index)!=' '){
                System.out.print(newInput.charAt(index));
            }
        }
        System.out.println();
        System.out.println(input.replace(" ",""));
//            System.out.println(input);
            }

        }

