package chapterSeven;

import java.util.Arrays;

public class ArrayOfNoiseMaker {

    public static void main(String[] args) {
        String [] names = {"Increase", "Dammy", "Otunba", "Rayo"};

        System.out.println("The names of the noisemakers in my list are "+ names[0]+" "+names[1]+" "+names[2]+" "+names[3]);
        System.out.printf("The names of the noisemakers in my list are %s %s %s %s\n",names);
        System.out.print("The names of the noisemakers in my list are ");
        for(int name =0; name < names.length;name++){
            System.out.print(names[name] +" ");
        }
    }
}
