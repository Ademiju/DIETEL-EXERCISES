import data.model.Account;
import data.model.Gender;
import data.model.User;
import data.model.UserUpdateForm;
import org.junit.jupiter.api.Test;
import util.Util;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTest {
    @Test
    void createUser(){
        User user = new User("Maryjane", "Alao", "mj_alao@gmail.com", Gender.FEMALE);
        assertEquals(user.getFirstName(), "Maryjane");
        assertEquals(user.getLastName(), "Alao");
        assertEquals(user.getGender(), Gender.FEMALE);
        assertEquals(user.getEmail(), "mj_alao@gmail.com");
    }

    @Test
    void testCanGenerateAccountNumberForUser(){
        User user = new User("Maryjane", "Alao", "mj_alao@gmail.com", Gender.FEMALE);
        String accountNumber = Util.createAccountNumber();
        Account account = new Account("mj_alao@gmail.com",accountNumber , 0.0, LocalDateTime.now());
        user.setAccount(accountNumber);
        assertNotNull(user.getAccountNumber());
        assertEquals(10, user.getAccountNumber().length());
    }


    @Test
    void userCanUpdateProfile(){
        User user = new User("Maryjane", "Alao", "mj_alao@gmail.com", Gender.FEMALE);
        UserUpdateForm updateForm = new UserUpdateForm();
        updateForm.setPhoneNumber("07065249636");
        updateForm.setLastName("Otunba");
        user.updateProfile(updateForm);

        assertEquals("Otunba", user.getLastName());
        assertEquals("07065249636", user.getPhoneNumber());

    }



}
