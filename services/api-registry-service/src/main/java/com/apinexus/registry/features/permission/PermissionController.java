package com.apinexus.registry.features.permission;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/permission")
public class PermissionController {
    private final PermissionService service;
    public PermissionController(PermissionService service) { this.service = service; }
    @GetMapping
    public List<Permission> getAll() { return service.findAll(); }
    @PostMapping
    public Permission create(@RequestBody Permission entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
