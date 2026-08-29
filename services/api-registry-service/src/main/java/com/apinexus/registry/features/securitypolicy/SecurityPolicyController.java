package com.apinexus.registry.features.securitypolicy;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/securitypolicy")
public class SecurityPolicyController {
    private final SecurityPolicyService service;
    public SecurityPolicyController(SecurityPolicyService service) { this.service = service; }
    @GetMapping
    public List<SecurityPolicy> getAll() { return service.findAll(); }
    @PostMapping
    public SecurityPolicy create(@RequestBody SecurityPolicy entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
