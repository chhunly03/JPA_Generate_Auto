package com.khrd.test_jpa_generate_auto;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
}
