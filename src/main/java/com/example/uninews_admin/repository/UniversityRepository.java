package com.example.uninews_admin.repository;

import com.example.uninews_admin.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {
    University findByUniversityName(String universityName);
}
