package com.apinexus.registry.massive.hubstore561;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubstore561")
public class HubStore561Controller {
    private final HubStore561Service service;
    
    public HubStore561Controller(HubStore561Service service) { this.service = service; }
    
    @GetMapping
    public List<HubStore561> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubStore561 create(@RequestBody HubStore561 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubStore561";
    }
}
