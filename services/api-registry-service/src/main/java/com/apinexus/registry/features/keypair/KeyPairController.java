package com.apinexus.registry.features.keypair;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/keypair")
public class KeyPairController {
    private final KeyPairService service;
    public KeyPairController(KeyPairService service) { this.service = service; }
    @GetMapping
    public List<KeyPair> getAll() { return service.findAll(); }
    @PostMapping
    public KeyPair create(@RequestBody KeyPair entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
