package com.apinexus.registry.features.samlidp;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/samlidp")
public class SamlIdpController {
    private final SamlIdpService service;
    public SamlIdpController(SamlIdpService service) { this.service = service; }
    @GetMapping
    public List<SamlIdp> getAll() { return service.findAll(); }
    @PostMapping
    public SamlIdp create(@RequestBody SamlIdp entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
