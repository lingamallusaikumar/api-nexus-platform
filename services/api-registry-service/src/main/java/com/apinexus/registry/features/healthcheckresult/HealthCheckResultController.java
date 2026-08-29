package com.apinexus.registry.features.healthcheckresult;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/healthcheckresult")
public class HealthCheckResultController {
    private final HealthCheckResultService service;
    public HealthCheckResultController(HealthCheckResultService service) { this.service = service; }
    @GetMapping
    public List<HealthCheckResult> getAll() { return service.findAll(); }
    @PostMapping
    public HealthCheckResult create(@RequestBody HealthCheckResult entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
