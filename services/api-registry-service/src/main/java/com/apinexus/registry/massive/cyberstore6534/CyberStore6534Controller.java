package com.apinexus.registry.massive.cyberstore6534;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberstore6534")
public class CyberStore6534Controller {
    private final CyberStore6534Service service;
    
    public CyberStore6534Controller(CyberStore6534Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberStore6534> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberStore6534 create(@RequestBody CyberStore6534 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberStore6534";
    }
}
