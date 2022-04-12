package chapterForteen;

public class ReverseBallonCharacter {
    public static void main(String[] args) {
        String name = "BALLOON";
        String nameReverse ="";
        for(int index = name.length()-1; index >= 0; index--){
            nameReverse += name.charAt(index);
        }
        System.out.println(nameReverse);
    }
}
