package com.apinexus.registry.features.billingprofile;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/billingprofile")
public class BillingProfileController {
    private final BillingProfileService service;
    public BillingProfileController(BillingProfileService service) { this.service = service; }
    @GetMapping
    public List<BillingProfile> getAll() { return service.findAll(); }
    @PostMapping
    public BillingProfile create(@RequestBody BillingProfile entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
