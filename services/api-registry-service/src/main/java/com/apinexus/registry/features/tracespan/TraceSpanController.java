package com.apinexus.registry.features.tracespan;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/tracespan")
public class TraceSpanController {
    private final TraceSpanService service;
    public TraceSpanController(TraceSpanService service) { this.service = service; }
    @GetMapping
    public List<TraceSpan> getAll() { return service.findAll(); }
    @PostMapping
    public TraceSpan create(@RequestBody TraceSpan entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
