package com.simran.college.service;

import com.simran.college.entity.StudentApplication;
import com.simran.college.repository.StudentApplicationRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentApplicationService {

    private final StudentApplicationRepository repository;

    public StudentApplicationService(StudentApplicationRepository repository) {
        this.repository = repository;
    }

    public StudentApplication saveApplication(StudentApplication application) {
        return repository.save(application);
    }
}
