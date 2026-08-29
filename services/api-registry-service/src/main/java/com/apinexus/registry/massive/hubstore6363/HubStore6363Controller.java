package com.apinexus.registry.massive.hubstore6363;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubstore6363")
public class HubStore6363Controller {
    private final HubStore6363Service service;
    
    public HubStore6363Controller(HubStore6363Service service) { this.service = service; }
    
    @GetMapping
    public List<HubStore6363> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubStore6363 create(@RequestBody HubStore6363 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubStore6363";
    }
}
