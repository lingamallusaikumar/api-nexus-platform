package com.apinexus.registry.features.quotaallocation;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/quotaallocation")
public class QuotaAllocationController {
    private final QuotaAllocationService service;
    public QuotaAllocationController(QuotaAllocationService service) { this.service = service; }
    @GetMapping
    public List<QuotaAllocation> getAll() { return service.findAll(); }
    @PostMapping
    public QuotaAllocation create(@RequestBody QuotaAllocation entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
