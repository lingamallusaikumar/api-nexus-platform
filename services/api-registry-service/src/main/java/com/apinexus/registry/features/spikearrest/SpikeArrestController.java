package com.apinexus.registry.features.spikearrest;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/spikearrest")
public class SpikeArrestController {
    private final SpikeArrestService service;
    public SpikeArrestController(SpikeArrestService service) { this.service = service; }
    @GetMapping
    public List<SpikeArrest> getAll() { return service.findAll(); }
    @PostMapping
    public SpikeArrest create(@RequestBody SpikeArrest entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
