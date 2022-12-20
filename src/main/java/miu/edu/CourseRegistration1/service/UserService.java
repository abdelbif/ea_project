package miu.edu.CourseRegistration1.service;

import miu.edu.CourseRegistration1.entity.Users;

public interface UserService {
    void addUser(Users u);
    void deleteUserById(Long id);

}