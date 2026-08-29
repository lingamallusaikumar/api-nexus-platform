package com.apinexus.registry.massive.dynamicbroker29;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicbroker29")
public class DynamicBroker29Controller {
    private final DynamicBroker29Service service;
    
    public DynamicBroker29Controller(DynamicBroker29Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicBroker29> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicBroker29 create(@RequestBody DynamicBroker29 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicBroker29";
    }
}
