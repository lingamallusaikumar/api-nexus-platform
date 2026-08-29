package com.apinexus.registry.features.webhookendpoint;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/webhookendpoint")
public class WebhookEndpointController {
    private final WebhookEndpointService service;
    public WebhookEndpointController(WebhookEndpointService service) { this.service = service; }
    @GetMapping
    public List<WebhookEndpoint> getAll() { return service.findAll(); }
    @PostMapping
    public WebhookEndpoint create(@RequestBody WebhookEndpoint entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
