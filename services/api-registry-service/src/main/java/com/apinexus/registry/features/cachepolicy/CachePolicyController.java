package com.apinexus.registry.features.cachepolicy;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cachepolicy")
public class CachePolicyController {
    private final CachePolicyService service;
    public CachePolicyController(CachePolicyService service) { this.service = service; }
    @GetMapping
    public List<CachePolicy> getAll() { return service.findAll(); }
    @PostMapping
    public CachePolicy create(@RequestBody CachePolicy entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
