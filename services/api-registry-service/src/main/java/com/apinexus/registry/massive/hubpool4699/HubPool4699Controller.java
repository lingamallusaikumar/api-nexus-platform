package com.apinexus.registry.massive.hubpool4699;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubpool4699")
public class HubPool4699Controller {
    private final HubPool4699Service service;
    
    public HubPool4699Controller(HubPool4699Service service) { this.service = service; }
    
    @GetMapping
    public List<HubPool4699> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubPool4699 create(@RequestBody HubPool4699 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubPool4699";
    }
}
