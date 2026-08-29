package com.apinexus.registry.massive.zonegateway7531;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/zonegateway7531")
public class ZoneGateway7531Controller {
    private final ZoneGateway7531Service service;
    
    public ZoneGateway7531Controller(ZoneGateway7531Service service) { this.service = service; }
    
    @GetMapping
    public List<ZoneGateway7531> getAll() { return service.findAll(); }
    
    @PostMapping
    public ZoneGateway7531 create(@RequestBody ZoneGateway7531 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ZoneGateway7531";
    }
}
