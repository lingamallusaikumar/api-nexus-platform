package com.apinexus.registry.repository;

import com.apinexus.registry.model.ApiDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApiRepository extends JpaRepository<ApiDefinition, String> {
    List<ApiDefinition> findByStatus(String status);
}

