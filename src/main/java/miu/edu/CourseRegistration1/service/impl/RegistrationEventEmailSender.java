package miu.edu.CourseRegistration1.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Calendar;



@AllArgsConstructor
@Service
public class RegistrationEventEmailSender {
//    JmsTemplate jmsTemplate;
//    RegistrationEventRepo registrationEventRepo;
//
//    @Scheduled(fixedRate = 2000)
//    public void sendEmailReminder() {
//        Date date = Calendar. getInstance() .getTime () ;
//        DateFormat timeFormatter = DateFormat.getTimeInstance (DateFormat .DEFAULT) ;
//        String currentTime = timeFormatter. format (date);
//        System.out.println("This task runs at" + currentTime);
//        List<RegistrationEvent> registrationEvents = registrationEventRepo. findAll();
//        jmsTemplate.convertAndSend(registrationEventQueue, registrationEvents );
//
//        for(RegistrationEvent registrationEvent: registrationEvents){
//            LocalDateTime now = LocalDateTime.now();
//            Duration duration = Duration.between (registrationEvent.getEndDate(), now);
//            if (duration.toHours() == 4 || duration. toHours() == 8){
//
//                jmsTemplate.convertAndSend("OpenRegistrationEventQueue",
//                        "Registration will be closed after" + duration.toHours()  + " hours");
//            }
//        }
//    }
}
