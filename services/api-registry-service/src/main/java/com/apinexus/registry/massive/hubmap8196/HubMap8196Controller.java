package com.apinexus.registry.massive.hubmap8196;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubmap8196")
public class HubMap8196Controller {
    private final HubMap8196Service service;
    
    public HubMap8196Controller(HubMap8196Service service) { this.service = service; }
    
    @GetMapping
    public List<HubMap8196> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubMap8196 create(@RequestBody HubMap8196 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubMap8196";
    }
}
