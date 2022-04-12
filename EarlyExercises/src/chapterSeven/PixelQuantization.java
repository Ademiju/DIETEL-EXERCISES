package chapterSeven;

import java.util.Arrays;

public class PixelQuantization {
    public static void main(String[] args) {
        int [] pixelNumber = {23,12,32,42,41,54,24,67,89,90,45,55,121,200,200,173,201,29,40,68,99,119,124};
        for(int count = 0; count < pixelNumber.length; count++){
            if(pixelNumber[count] <= 20){
                pixelNumber[count] = 10;
            }
            else if(pixelNumber[count] <= 40){
                pixelNumber[count] = 30;
            }
            else if(pixelNumber[count] <= 60){
                pixelNumber[count] = 50;
            }
            else if(pixelNumber[count] <= 80){
                pixelNumber[count] = 70;
            }
            else if(pixelNumber[count] <= 100){
                pixelNumber[count] = 90;
            }
            else if(pixelNumber[count] <= 120){
                pixelNumber[count] = 110;
            }
            else if(pixelNumber[count] <= 140){
                pixelNumber[count] = 130;
            }
            else if(pixelNumber[count] <= 160){
                pixelNumber[count] = 150;
            }
            else if(pixelNumber[count] <=180){
                pixelNumber[count] = 170;
            }
            else{
                pixelNumber[count] =190;
            }

        }
        System.out.println("Quantized Pixel Value");
        System.out.println(Arrays.toString(pixelNumber));

    }
}
