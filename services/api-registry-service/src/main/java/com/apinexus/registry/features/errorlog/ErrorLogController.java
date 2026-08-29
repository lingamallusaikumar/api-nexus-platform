package com.apinexus.registry.features.errorlog;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/errorlog")
public class ErrorLogController {
    private final ErrorLogService service;
    public ErrorLogController(ErrorLogService service) { this.service = service; }
    @GetMapping
    public List<ErrorLog> getAll() { return service.findAll(); }
    @PostMapping
    public ErrorLog create(@RequestBody ErrorLog entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
