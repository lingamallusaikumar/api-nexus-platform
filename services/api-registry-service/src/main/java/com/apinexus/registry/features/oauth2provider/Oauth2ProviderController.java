package com.apinexus.registry.features.oauth2provider;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/oauth2provider")
public class Oauth2ProviderController {
    private final Oauth2ProviderService service;
    public Oauth2ProviderController(Oauth2ProviderService service) { this.service = service; }
    @GetMapping
    public List<Oauth2Provider> getAll() { return service.findAll(); }
    @PostMapping
    public Oauth2Provider create(@RequestBody Oauth2Provider entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
