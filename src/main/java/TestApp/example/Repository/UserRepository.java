package TestApp.example.TestApp.Repository;

import TestApp.example.TestApp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
