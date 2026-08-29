package com.apinexus.registry.features.certificate;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/certificate")
public class CertificateController {
    private final CertificateService service;
    public CertificateController(CertificateService service) { this.service = service; }
    @GetMapping
    public List<Certificate> getAll() { return service.findAll(); }
    @PostMapping
    public Certificate create(@RequestBody Certificate entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
