package data.repository;

import data.model.Gender;
import data.model.User;
import org.junit.jupiter.api.Test;
import service.UserService;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    @Test
    void userRegister(){
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        User user = userService.register("Maryjane", "Alao", "mj_alao@gmail.com", Gender.FEMALE);
        assertNotNull(user);
        assertEquals("Maryjane", user.getFirstName());
        assertEquals("Alao",user.getLastName());
        assertEquals("mj_alao@gmail.com", user.getEmail());
    }

}