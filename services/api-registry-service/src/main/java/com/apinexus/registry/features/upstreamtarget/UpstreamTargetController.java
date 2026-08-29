package com.apinexus.registry.features.upstreamtarget;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/upstreamtarget")
public class UpstreamTargetController {
    private final UpstreamTargetService service;
    public UpstreamTargetController(UpstreamTargetService service) { this.service = service; }
    @GetMapping
    public List<UpstreamTarget> getAll() { return service.findAll(); }
    @PostMapping
    public UpstreamTarget create(@RequestBody UpstreamTarget entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
