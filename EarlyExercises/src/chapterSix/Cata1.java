package chapterSix;



public class Cata1 {
    private int score;
    private String grade;
   int[] numbers = new int[]{1, 2, 3, 4, 5};


    public static int calculateTotalOf(int[] numbers) {

        int total = 0;
        for(int count = 0; count< numbers.length; count++) {
            total = total + numbers[count];
        }
    return total;
    }

    public static int calculateMinimumOf(int[] numbers) {
    int minimum = numbers[0];
    for(int count = 0; count < numbers.length; count++){
        Math.min(numbers[0], numbers[count]);
    }
return minimum;
    }

    public static int calculateMaximumOf(int[] numbers) {
        int maximum = numbers[0];
        for (int count = 0; count < numbers.length; count++) {
            maximum= Math.max(numbers[0],numbers[count] );
        }
            return maximum;
        }

    public static int calculateAverageOf(int[] numbers) {
        int total = 0;
        int average = 0;


        //enhanced For Loop
//        for(int number : numbers){
//            total+= number;
//        }

        for (int count = 0; count < numbers.length; count++) {
            total = total + numbers[count];
             average = total / (numbers.length );
        }
        return (int) average;
    }

    public static int calculateOneLessMinOf(int[] numbers) {

        return calculateTotalOf(numbers) - calculateMaximumOf(numbers);
    }

    public static int calculateOneLessMaxOf(int[] numbers) {
    return calculateTotalOf(numbers)-calculateMinimumOf(numbers);
    }


    public void changeScoreToGrade(int score) {
        if (score >= 90) {
        grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade ="F";
        }
    }

        public String getGrade(){
        return grade;
        }


    }





