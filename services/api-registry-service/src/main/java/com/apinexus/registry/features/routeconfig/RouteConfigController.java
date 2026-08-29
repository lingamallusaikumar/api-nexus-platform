package com.apinexus.registry.features.routeconfig;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/routeconfig")
public class RouteConfigController {
    private final RouteConfigService service;
    public RouteConfigController(RouteConfigService service) { this.service = service; }
    @GetMapping
    public List<RouteConfig> getAll() { return service.findAll(); }
    @PostMapping
    public RouteConfig create(@RequestBody RouteConfig entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
