package com.simran.college.controller;

import com.simran.college.entity.StudentApplication;
import com.simran.college.service.StudentApplicationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applications")
@CrossOrigin
public class StudentApplicationController {

    private final StudentApplicationService service;

    public StudentApplicationController(StudentApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public StudentApplication submitApplication(
            @RequestBody StudentApplication application) {
        return service.saveApplication(application);
    }

    // temporary test
    @GetMapping
    public String test() {
        return "Application API is working";
    }
}
