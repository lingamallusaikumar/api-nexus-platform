package com.apinexus.registry.features.corspolicy;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/corspolicy")
public class CorsPolicyController {
    private final CorsPolicyService service;
    public CorsPolicyController(CorsPolicyService service) { this.service = service; }
    @GetMapping
    public List<CorsPolicy> getAll() { return service.findAll(); }
    @PostMapping
    public CorsPolicy create(@RequestBody CorsPolicy entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
