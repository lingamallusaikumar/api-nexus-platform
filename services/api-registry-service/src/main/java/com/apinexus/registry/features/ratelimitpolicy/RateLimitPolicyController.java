package com.apinexus.registry.features.ratelimitpolicy;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ratelimitpolicy")
public class RateLimitPolicyController {
    private final RateLimitPolicyService service;
    public RateLimitPolicyController(RateLimitPolicyService service) { this.service = service; }
    @GetMapping
    public List<RateLimitPolicy> getAll() { return service.findAll(); }
    @PostMapping
    public RateLimitPolicy create(@RequestBody RateLimitPolicy entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
