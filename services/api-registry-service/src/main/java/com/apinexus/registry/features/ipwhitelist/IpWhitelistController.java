package com.apinexus.registry.features.ipwhitelist;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ipwhitelist")
public class IpWhitelistController {
    private final IpWhitelistService service;
    public IpWhitelistController(IpWhitelistService service) { this.service = service; }
    @GetMapping
    public List<IpWhitelist> getAll() { return service.findAll(); }
    @PostMapping
    public IpWhitelist create(@RequestBody IpWhitelist entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
