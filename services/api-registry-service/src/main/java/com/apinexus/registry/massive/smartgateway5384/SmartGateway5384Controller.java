package com.apinexus.registry.massive.smartgateway5384;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartgateway5384")
public class SmartGateway5384Controller {
    private final SmartGateway5384Service service;
    
    public SmartGateway5384Controller(SmartGateway5384Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartGateway5384> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartGateway5384 create(@RequestBody SmartGateway5384 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartGateway5384";
    }
}
