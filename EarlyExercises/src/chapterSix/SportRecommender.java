package chapterSix;

import java.util.Scanner;

public class SportRecommender {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the current temperature in Celsius");
        int user_temperature = input.nextInt();
        displayExerciseCondition(user_temperature);

    }





    public static void displayExerciseCondition(int temperature){
        if(temperature >= 20 && temperature <= 30 ){
            System.out.println("It’s lovely weather for sports today!");
        }
        else if(temperature >= 10 && temperature <=40){
            System.out.println("It’s reasonable weather for sports today!");
        }else{
            System.out.println("Please exercise with care today, watch out for the weather!");
        }

    }

}
