package com.apinexus.developer.repository;

import com.apinexus.developer.model.DeveloperApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeveloperApplicationRepository extends JpaRepository<DeveloperApplication, String> {
    List<DeveloperApplication> findByDeveloperId(String developerId);
}

