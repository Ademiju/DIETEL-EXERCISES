package service;

import data.model.Gender;
import data.model.User;
import data.repository.UserRepository;

public class UserService {
    private static UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        UserService.userRepository = userRepository;
    }

    public User register(String firstName, String lastName, String email, Gender gender) {
        User user = new User(firstName, lastName, email, gender);
        user = userRepository.save(user);
        return user;
    }
}
