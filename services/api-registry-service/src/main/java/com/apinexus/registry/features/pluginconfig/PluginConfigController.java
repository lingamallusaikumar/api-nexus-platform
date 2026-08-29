package com.apinexus.registry.features.pluginconfig;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pluginconfig")
public class PluginConfigController {
    private final PluginConfigService service;
    public PluginConfigController(PluginConfigService service) { this.service = service; }
    @GetMapping
    public List<PluginConfig> getAll() { return service.findAll(); }
    @PostMapping
    public PluginConfig create(@RequestBody PluginConfig entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
