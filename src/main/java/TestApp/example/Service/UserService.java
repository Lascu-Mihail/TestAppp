package TestApp.example.Service;

import TestApp.example.Entity.Role;
import TestApp.example.Entity.User;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}

