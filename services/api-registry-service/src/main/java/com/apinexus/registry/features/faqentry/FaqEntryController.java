package com.apinexus.registry.features.faqentry;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/faqentry")
public class FaqEntryController {
    private final FaqEntryService service;
    public FaqEntryController(FaqEntryService service) { this.service = service; }
    @GetMapping
    public List<FaqEntry> getAll() { return service.findAll(); }
    @PostMapping
    public FaqEntry create(@RequestBody FaqEntry entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
