package chapterFive;

public class CalculatingTheValueOfPi {
    public static void main(String[] args) {
        double sum = 0;
        int number = 3;
        double pi;
            while (number < 200000) {
                 pi = 4 / (number);
                sum +=pi;
                number+=2;
                System.out.println(pi);
            }

        }
    }
