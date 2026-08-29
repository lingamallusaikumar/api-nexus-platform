package com.apinexus.registry.massive.cybercontroller292;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cybercontroller292")
public class CyberController292Controller {
    private final CyberController292Service service;
    
    public CyberController292Controller(CyberController292Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberController292> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberController292 create(@RequestBody CyberController292 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberController292";
    }
}
