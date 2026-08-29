package com.apinexus.registry.massive.smartrepo3881;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartrepo3881")
public class SmartRepo3881Controller {
    private final SmartRepo3881Service service;
    
    public SmartRepo3881Controller(SmartRepo3881Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartRepo3881> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartRepo3881 create(@RequestBody SmartRepo3881 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartRepo3881";
    }
}
