package com.apinexus.registry.features.websocketroute;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/websocketroute")
public class WebSocketRouteController {
    private final WebSocketRouteService service;
    public WebSocketRouteController(WebSocketRouteService service) { this.service = service; }
    @GetMapping
    public List<WebSocketRoute> getAll() { return service.findAll(); }
    @PostMapping
    public WebSocketRoute create(@RequestBody WebSocketRoute entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
