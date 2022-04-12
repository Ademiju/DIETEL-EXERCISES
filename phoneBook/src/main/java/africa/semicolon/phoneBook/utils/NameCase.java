package africa.semicolon.phoneBook.utils;

import africa.semicolon.phoneBook.dtos.requests.AddContactRequest;

public class NameCase {
    public static void changeToSentenceCase(AddContactRequest request){
        request.setFirstName(changeCase(request.getFirstName()));
        request.setMiddleName(changeCase(request.getMiddleName()));
        request.setLastName(changeCase(request.getLastName()));
    }

    private static String changeCase(String name) {
               return Character.toUpperCase(name.charAt(0)) +name.substring(1).toLowerCase();
    }
}
