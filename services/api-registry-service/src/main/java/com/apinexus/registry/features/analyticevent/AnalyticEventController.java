package com.apinexus.registry.features.analyticevent;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/analyticevent")
public class AnalyticEventController {
    private final AnalyticEventService service;
    public AnalyticEventController(AnalyticEventService service) { this.service = service; }
    @GetMapping
    public List<AnalyticEvent> getAll() { return service.findAll(); }
    @PostMapping
    public AnalyticEvent create(@RequestBody AnalyticEvent entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
