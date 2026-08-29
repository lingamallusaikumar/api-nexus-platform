package com.apinexus.registry.massive.smartstack7701;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartstack7701")
public class SmartStack7701Controller {
    private final SmartStack7701Service service;
    
    public SmartStack7701Controller(SmartStack7701Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartStack7701> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartStack7701 create(@RequestBody SmartStack7701 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartStack7701";
    }
}
