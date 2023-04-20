package project.dao;

import project.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    List<User> getAllUser();

    void updateUser(User user);

    //void userEditor(User user, Long id);
}
