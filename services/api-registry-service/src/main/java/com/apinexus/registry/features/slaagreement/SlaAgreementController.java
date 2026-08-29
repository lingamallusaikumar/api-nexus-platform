package com.apinexus.registry.features.slaagreement;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/slaagreement")
public class SlaAgreementController {
    private final SlaAgreementService service;
    public SlaAgreementController(SlaAgreementService service) { this.service = service; }
    @GetMapping
    public List<SlaAgreement> getAll() { return service.findAll(); }
    @PostMapping
    public SlaAgreement create(@RequestBody SlaAgreement entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
