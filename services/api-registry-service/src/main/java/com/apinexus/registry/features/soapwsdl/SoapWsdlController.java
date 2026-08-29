package com.apinexus.registry.features.soapwsdl;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/soapwsdl")
public class SoapWsdlController {
    private final SoapWsdlService service;
    public SoapWsdlController(SoapWsdlService service) { this.service = service; }
    @GetMapping
    public List<SoapWsdl> getAll() { return service.findAll(); }
    @PostMapping
    public SoapWsdl create(@RequestBody SoapWsdl entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
