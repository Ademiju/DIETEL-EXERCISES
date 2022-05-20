package chapterForteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaseBallPoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol = input.nextLine();
        String  [] s = symbol.split(" ");
        System.out.println(point(s));
    }

    public static int point(String [] pt){
        int result = 0;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < pt.length; i++){
//            if(pt[i].matches("[0-9]")){
//                numbers.add(Integer.parseInt(pt[i]));
////              numbers.add(Integer.parseInt(pt[i]));
//            }
            if(pt[i].matches("[0-9]")) {
                numbers.add(Integer.parseInt(pt[i]));
            }
            if(pt[i].contains(Character.toString('-'))){
                numbers.add(Integer.parseInt(pt[i]));
            }
            if(pt[i].equals("C")){
                numbers.remove(numbers.size()-1);
            }
            if(pt[i].equals("D")) {
                int num = numbers.get(numbers.size() - 1);
                numbers.add(num * 2);
            }
            if(pt[i].equals("+")){
                  int sum = numbers.get(numbers.size()-1) + numbers.get(numbers.size()-2);
                numbers.add(sum);
            }
            System.out.println(Arrays.toString(numbers.toArray()));
        }
        for (int number:numbers) {
            result += number;
        }
        return result;
    }
}
