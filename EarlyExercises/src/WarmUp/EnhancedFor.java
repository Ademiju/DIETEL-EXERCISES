package WarmUp;

import java.util.ArrayList;
import java.util.List;

public class EnhancedFor {

    public static void printArrayList(List<String> arrayLists){
        for (String arrayList : arrayLists
             ) {
            System.out.println(arrayList);

        }
    }

    public static void main(String[] args) {
        List <String> shoppingLists = List.of(new String[]{"clothes", "wrapper","laptop","food","towel","provision"});
        printArrayList(shoppingLists);
    }
}
