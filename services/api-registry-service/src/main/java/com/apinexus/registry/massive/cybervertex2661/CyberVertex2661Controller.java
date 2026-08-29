package com.apinexus.registry.massive.cybervertex2661;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cybervertex2661")
public class CyberVertex2661Controller {
    private final CyberVertex2661Service service;
    
    public CyberVertex2661Controller(CyberVertex2661Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberVertex2661> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberVertex2661 create(@RequestBody CyberVertex2661 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberVertex2661";
    }
}
