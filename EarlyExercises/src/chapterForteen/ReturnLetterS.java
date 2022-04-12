package chapterForteen;

import java.util.ArrayList;
import java.util.List;

public class ReturnLetterS {
    public static void main(String[] args) {
        String sea = "MiSsisSippi";
        List<Integer> indices = new ArrayList<>();
        for(int index = 0; index < sea.length(); index++ ) {
            String newSea = sea.toLowerCase();
            if (newSea.charAt(index) == 's') {
                indices.add(newSea.indexOf("s", index));
            }
        }
//OR
            for(int count = 0; count < sea.length(); count++ ){
                if(sea.charAt(count) == 's' || sea.charAt(count) =='S'){
                    indices.add(sea.indexOf(sea.charAt(count),count));
                }
//
            }

        System.out.println(indices);

//        System.out.println(indices.add(sea.indexOf("i")));
//        System.out.println(indices.add(sea.indexOf("i",2)));
//        System.out.println(indices.add(sea.indexOf("i",6)));
//        System.out.println(indices.add(sea.indexOf("i",8)));
//        System.out.println(indices);

    }
}
