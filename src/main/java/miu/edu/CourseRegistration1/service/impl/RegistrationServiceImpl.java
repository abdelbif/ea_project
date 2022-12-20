package miu.edu.CourseRegistration1.service.impl;

import lombok.AllArgsConstructor;
import miu.edu.CourseRegistration1.entity.Registration;
import miu.edu.CourseRegistration1.repository.RegistrationRepo;
import miu.edu.CourseRegistration1.service.RegistrationService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {
    RegistrationRepo registrationRepo;

    @Override
    public List<Registration> getAllRegistrations() {

        return registrationRepo.findAll();
    }
}
