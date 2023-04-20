package project.service;

import org.springframework.transaction.annotation.Transactional;
import project.dao.UserDao;
import project.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    List<User> getAllUser();


    void updateUser(User user);

    //void userEditor(User user, Long id);
}
