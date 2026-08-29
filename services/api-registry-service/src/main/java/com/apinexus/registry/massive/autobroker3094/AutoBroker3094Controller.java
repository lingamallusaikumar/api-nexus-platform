package com.apinexus.registry.massive.autobroker3094;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autobroker3094")
public class AutoBroker3094Controller {
    private final AutoBroker3094Service service;
    
    public AutoBroker3094Controller(AutoBroker3094Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoBroker3094> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoBroker3094 create(@RequestBody AutoBroker3094 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoBroker3094";
    }
}
