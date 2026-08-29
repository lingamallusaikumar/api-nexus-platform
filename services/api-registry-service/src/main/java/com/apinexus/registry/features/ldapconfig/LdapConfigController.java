package com.apinexus.registry.features.ldapconfig;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ldapconfig")
public class LdapConfigController {
    private final LdapConfigService service;
    public LdapConfigController(LdapConfigService service) { this.service = service; }
    @GetMapping
    public List<LdapConfig> getAll() { return service.findAll(); }
    @PostMapping
    public LdapConfig create(@RequestBody LdapConfig entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
