package com.apinexus.registry.features.apiversion;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/apiversion")
public class ApiVersionController {
    private final ApiVersionService service;
    public ApiVersionController(ApiVersionService service) { this.service = service; }
    @GetMapping
    public List<ApiVersion> getAll() { return service.findAll(); }
    @PostMapping
    public ApiVersion create(@RequestBody ApiVersion entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
