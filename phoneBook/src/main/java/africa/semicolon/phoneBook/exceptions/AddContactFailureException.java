package africa.semicolon.phoneBook.exceptions;

import org.springframework.beans.factory.annotation.Autowired;

public class AddContactFailureException extends RuntimeException{
    public AddContactFailureException(String message) {
        super(message);
    }
}
