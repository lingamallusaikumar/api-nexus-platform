package com.apinexus.registry.massive.cybervertex9351;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cybervertex9351")
public class CyberVertex9351Controller {
    private final CyberVertex9351Service service;
    
    public CyberVertex9351Controller(CyberVertex9351Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberVertex9351> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberVertex9351 create(@RequestBody CyberVertex9351 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberVertex9351";
    }
}
