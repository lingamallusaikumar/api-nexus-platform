package com.apinexus.registry.massive.autogateway7613;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autogateway7613")
public class AutoGateway7613Controller {
    private final AutoGateway7613Service service;
    
    public AutoGateway7613Controller(AutoGateway7613Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoGateway7613> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoGateway7613 create(@RequestBody AutoGateway7613 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoGateway7613";
    }
}
