package com.apinexus.registry.massive.smartbuffer136;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartbuffer136")
public class SmartBuffer136Controller {
    private final SmartBuffer136Service service;
    
    public SmartBuffer136Controller(SmartBuffer136Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartBuffer136> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartBuffer136 create(@RequestBody SmartBuffer136 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartBuffer136";
    }
}
