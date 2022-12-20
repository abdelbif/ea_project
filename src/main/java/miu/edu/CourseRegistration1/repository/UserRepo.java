package miu.edu.CourseRegistration1.repository;

import miu.edu.CourseRegistration1.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long> {
    Users findByEmail(String username);
}
