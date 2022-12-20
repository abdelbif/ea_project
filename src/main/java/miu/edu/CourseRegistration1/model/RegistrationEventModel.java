package miu.edu.CourseRegistration1.model;

import lombok.Data;
import miu.edu.CourseRegistration1.entity.RegistrationGroup;

import java.sql.Date;
import java.util.List;

@Data
public class RegistrationEventModel {
    private String status;
    private Date startDate;
    private  Date endDate;
}
