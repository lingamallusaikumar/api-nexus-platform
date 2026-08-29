package com.apinexus.registry.features.environmentvar;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/environmentvar")
public class EnvironmentVarController {
    private final EnvironmentVarService service;
    public EnvironmentVarController(EnvironmentVarService service) { this.service = service; }
    @GetMapping
    public List<EnvironmentVar> getAll() { return service.findAll(); }
    @PostMapping
    public EnvironmentVar create(@RequestBody EnvironmentVar entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
