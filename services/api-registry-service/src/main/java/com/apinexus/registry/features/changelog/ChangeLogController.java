package com.apinexus.registry.features.changelog;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/changelog")
public class ChangeLogController {
    private final ChangeLogService service;
    public ChangeLogController(ChangeLogService service) { this.service = service; }
    @GetMapping
    public List<ChangeLog> getAll() { return service.findAll(); }
    @PostMapping
    public ChangeLog create(@RequestBody ChangeLog entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
