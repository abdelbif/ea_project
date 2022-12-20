package miu.edu.CourseRegistration1.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.CourseRegistration1.entity.Student;
import miu.edu.CourseRegistration1.entity.Users;
import miu.edu.CourseRegistration1.repository.UserRepo;
import miu.edu.CourseRegistration1.service.UserService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    UserRepo userRepo;

    @Override
    public void addUser(Users u) {
        userRepo.save(u);
    }

    @Override
    public void deleteUserById(Long studentId) {
        userRepo.deleteById(studentId);
    }

}