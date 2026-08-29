package com.apinexus.registry.massive.smartqueue975;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartqueue975")
public class SmartQueue975Controller {
    private final SmartQueue975Service service;
    
    public SmartQueue975Controller(SmartQueue975Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartQueue975> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartQueue975 create(@RequestBody SmartQueue975 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartQueue975";
    }
}
