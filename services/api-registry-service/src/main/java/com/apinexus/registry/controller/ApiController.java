package com.apinexus.registry.controller;

import com.apinexus.registry.model.ApiDefinition;
import com.apinexus.registry.repository.ApiRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/apis")
public class ApiController {

    private final ApiRepository apiRepository;

    public ApiController(ApiRepository apiRepository) {
        this.apiRepository = apiRepository;
    }

    @PostMapping
    public ResponseEntity<ApiDefinition> createApi(@RequestBody ApiDefinition apiDefinition) {
        return ResponseEntity.ok(apiRepository.save(apiDefinition));
    }

    @GetMapping
    public ResponseEntity<List<ApiDefinition>> getAllApis() {
        return ResponseEntity.ok(apiRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiDefinition> getApiById(@PathVariable String id) {
        return apiRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

