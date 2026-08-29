package com.apinexus.registry.features.openapispec;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/openapispec")
public class OpenApiSpecController {
    private final OpenApiSpecService service;
    public OpenApiSpecController(OpenApiSpecService service) { this.service = service; }
    @GetMapping
    public List<OpenApiSpec> getAll() { return service.findAll(); }
    @PostMapping
    public OpenApiSpec create(@RequestBody OpenApiSpec entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
