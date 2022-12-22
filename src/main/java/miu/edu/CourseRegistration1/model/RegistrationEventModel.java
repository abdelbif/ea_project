package miu.edu.CourseRegistration1.model;

import lombok.*;
import miu.edu.CourseRegistration1.entity.RegistrationGroup;

import java.sql.Date;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationEventModel {
    private String status;
    private Date startDate;
    private  Date endDate;
}
