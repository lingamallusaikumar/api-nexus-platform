package com.apinexus.developer.controller;

import com.apinexus.developer.model.DeveloperApplication;
import com.apinexus.developer.repository.DeveloperApplicationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/developer/applications")
public class ApplicationController {

    private final DeveloperApplicationRepository repository;

    public ApplicationController(DeveloperApplicationRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<DeveloperApplication> createApp(@RequestBody DeveloperApplication application) {
        return ResponseEntity.ok(repository.save(application));
    }

    @GetMapping("/user/{developerId}")
    public ResponseEntity<List<DeveloperApplication>> getAppsByDeveloper(@PathVariable String developerId) {
        return ResponseEntity.ok(repository.findByDeveloperId(developerId));
    }
}

