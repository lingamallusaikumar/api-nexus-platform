package com.apinexus.registry.massive.autobroker3350;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autobroker3350")
public class AutoBroker3350Controller {
    private final AutoBroker3350Service service;
    
    public AutoBroker3350Controller(AutoBroker3350Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoBroker3350> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoBroker3350 create(@RequestBody AutoBroker3350 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoBroker3350";
    }
}
