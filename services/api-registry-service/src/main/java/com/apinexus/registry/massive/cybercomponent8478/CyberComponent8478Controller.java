package com.apinexus.registry.massive.cybercomponent8478;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cybercomponent8478")
public class CyberComponent8478Controller {
    private final CyberComponent8478Service service;
    
    public CyberComponent8478Controller(CyberComponent8478Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberComponent8478> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberComponent8478 create(@RequestBody CyberComponent8478 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberComponent8478";
    }
}
