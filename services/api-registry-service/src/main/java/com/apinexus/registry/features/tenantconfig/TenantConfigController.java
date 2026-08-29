package com.apinexus.registry.features.tenantconfig;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tenantconfig")
public class TenantConfigController {
    private final TenantConfigService service;
    public TenantConfigController(TenantConfigService service) { this.service = service; }
    @GetMapping
    public List<TenantConfig> getAll() { return service.findAll(); }
    @PostMapping
    public TenantConfig create(@RequestBody TenantConfig entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
