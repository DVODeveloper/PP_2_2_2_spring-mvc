package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);

    User readUser(int id);

    void updateUser(int id, User user);

    void deleteUser(int id);

    List<User> getAllUsers();
}
