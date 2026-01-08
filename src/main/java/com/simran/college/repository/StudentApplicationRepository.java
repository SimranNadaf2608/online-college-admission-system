package com.simran.college.repository;

import com.simran.college.entity.StudentApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentApplicationRepository
        extends JpaRepository<StudentApplication, Long> {
}
