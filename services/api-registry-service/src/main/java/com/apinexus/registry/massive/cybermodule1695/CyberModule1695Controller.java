package com.apinexus.registry.massive.cybermodule1695;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cybermodule1695")
public class CyberModule1695Controller {
    private final CyberModule1695Service service;
    
    public CyberModule1695Controller(CyberModule1695Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberModule1695> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberModule1695 create(@RequestBody CyberModule1695 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberModule1695";
    }
}
