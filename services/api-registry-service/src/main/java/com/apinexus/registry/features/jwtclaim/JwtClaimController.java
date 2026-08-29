package com.apinexus.registry.features.jwtclaim;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/jwtclaim")
public class JwtClaimController {
    private final JwtClaimService service;
    public JwtClaimController(JwtClaimService service) { this.service = service; }
    @GetMapping
    public List<JwtClaim> getAll() { return service.findAll(); }
    @PostMapping
    public JwtClaim create(@RequestBody JwtClaim entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
