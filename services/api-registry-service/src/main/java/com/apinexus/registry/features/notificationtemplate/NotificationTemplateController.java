package com.apinexus.registry.features.notificationtemplate;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/notificationtemplate")
public class NotificationTemplateController {
    private final NotificationTemplateService service;
    public NotificationTemplateController(NotificationTemplateService service) { this.service = service; }
    @GetMapping
    public List<NotificationTemplate> getAll() { return service.findAll(); }
    @PostMapping
    public NotificationTemplate create(@RequestBody NotificationTemplate entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
