package WarmUp;

import java.security.SecureRandom;
import java.util.Arrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int [][][] numbers = new int[4][6][3];
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                for (int k = 0; k < numbers[i][j].length ; k++) {
                    SecureRandom random = new SecureRandom();
                    int number = 11 + random.nextInt(40);
                    numbers[i][j][k] = number;
                }
            }
        }
        System.out.println(Arrays.deepToString(numbers));
    }

}
