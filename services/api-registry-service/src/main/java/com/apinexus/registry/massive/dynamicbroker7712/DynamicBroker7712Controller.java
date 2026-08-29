package com.apinexus.registry.massive.dynamicbroker7712;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicbroker7712")
public class DynamicBroker7712Controller {
    private final DynamicBroker7712Service service;
    
    public DynamicBroker7712Controller(DynamicBroker7712Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicBroker7712> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicBroker7712 create(@RequestBody DynamicBroker7712 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicBroker7712";
    }
}
