package com.apinexus.registry.features.ticketcomment;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ticketcomment")
public class TicketCommentController {
    private final TicketCommentService service;
    public TicketCommentController(TicketCommentService service) { this.service = service; }
    @GetMapping
    public List<TicketComment> getAll() { return service.findAll(); }
    @PostMapping
    public TicketComment create(@RequestBody TicketComment entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
