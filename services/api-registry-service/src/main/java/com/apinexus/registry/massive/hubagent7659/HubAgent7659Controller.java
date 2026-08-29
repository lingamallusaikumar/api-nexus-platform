package com.apinexus.registry.massive.hubagent7659;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubagent7659")
public class HubAgent7659Controller {
    private final HubAgent7659Service service;
    
    public HubAgent7659Controller(HubAgent7659Service service) { this.service = service; }
    
    @GetMapping
    public List<HubAgent7659> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubAgent7659 create(@RequestBody HubAgent7659 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubAgent7659";
    }
}
