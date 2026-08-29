package com.apinexus.registry.features.markdowndoc;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/markdowndoc")
public class MarkdownDocController {
    private final MarkdownDocService service;
    public MarkdownDocController(MarkdownDocService service) { this.service = service; }
    @GetMapping
    public List<MarkdownDoc> getAll() { return service.findAll(); }
    @PostMapping
    public MarkdownDoc create(@RequestBody MarkdownDoc entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
