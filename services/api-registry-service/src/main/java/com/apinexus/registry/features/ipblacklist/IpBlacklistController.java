package com.apinexus.registry.features.ipblacklist;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ipblacklist")
public class IpBlacklistController {
    private final IpBlacklistService service;
    public IpBlacklistController(IpBlacklistService service) { this.service = service; }
    @GetMapping
    public List<IpBlacklist> getAll() { return service.findAll(); }
    @PostMapping
    public IpBlacklist create(@RequestBody IpBlacklist entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
