package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User showUserById(Long id);

    void addUser(User user);

    void updateUser(User user);

    void removeUser(Long id);
}