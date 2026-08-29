package com.apinexus.registry.massive.hubinterface5367;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubinterface5367")
public class HubInterface5367Controller {
    private final HubInterface5367Service service;
    
    public HubInterface5367Controller(HubInterface5367Service service) { this.service = service; }
    
    @GetMapping
    public List<HubInterface5367> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubInterface5367 create(@RequestBody HubInterface5367 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubInterface5367";
    }
}
