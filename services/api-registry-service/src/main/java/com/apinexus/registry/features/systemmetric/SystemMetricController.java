package com.apinexus.registry.features.systemmetric;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/systemmetric")
public class SystemMetricController {
    private final SystemMetricService service;
    public SystemMetricController(SystemMetricService service) { this.service = service; }
    @GetMapping
    public List<SystemMetric> getAll() { return service.findAll(); }
    @PostMapping
    public SystemMetric create(@RequestBody SystemMetric entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
