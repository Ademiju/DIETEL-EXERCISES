package data.repository;

import data.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public User save(User user) {
        users.add(user);
        return user;
    }
}
