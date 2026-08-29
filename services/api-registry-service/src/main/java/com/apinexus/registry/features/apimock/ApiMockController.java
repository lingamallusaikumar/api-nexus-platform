package com.apinexus.registry.features.apimock;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/apimock")
public class ApiMockController {
    private final ApiMockService service;
    public ApiMockController(ApiMockService service) { this.service = service; }
    @GetMapping
    public List<ApiMock> getAll() { return service.findAll(); }
    @PostMapping
    public ApiMock create(@RequestBody ApiMock entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
