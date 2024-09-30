package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    User readUser(int id);

    void updateUser(int id, User user);

    void deleteUser(int id);

    List<User> getAllUsers();
}
