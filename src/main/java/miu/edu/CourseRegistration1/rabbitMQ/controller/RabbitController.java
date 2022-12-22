package miu.edu.CourseRegistration1.rabbitMQ.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.CourseRegistration1.rabbitMQ.service.RabbitService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/")
public class RabbitController {
    final private RabbitService rabbitService;

}
