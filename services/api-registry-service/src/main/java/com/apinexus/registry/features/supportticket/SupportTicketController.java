package com.apinexus.registry.features.supportticket;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/supportticket")
public class SupportTicketController {
    private final SupportTicketService service;
    public SupportTicketController(SupportTicketService service) { this.service = service; }
    @GetMapping
    public List<SupportTicket> getAll() { return service.findAll(); }
    @PostMapping
    public SupportTicket create(@RequestBody SupportTicket entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
