package com.apinexus.registry.features.ratelimitwindow;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ratelimitwindow")
public class RateLimitWindowController {
    private final RateLimitWindowService service;
    public RateLimitWindowController(RateLimitWindowService service) { this.service = service; }
    @GetMapping
    public List<RateLimitWindow> getAll() { return service.findAll(); }
    @PostMapping
    public RateLimitWindow create(@RequestBody RateLimitWindow entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
