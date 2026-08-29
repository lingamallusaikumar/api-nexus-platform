package com.apinexus.registry.features.alertrule;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/alertrule")
public class AlertRuleController {
    private final AlertRuleService service;
    public AlertRuleController(AlertRuleService service) { this.service = service; }
    @GetMapping
    public List<AlertRule> getAll() { return service.findAll(); }
    @PostMapping
    public AlertRule create(@RequestBody AlertRule entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
