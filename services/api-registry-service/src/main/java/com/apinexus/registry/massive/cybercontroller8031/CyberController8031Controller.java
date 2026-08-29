package com.apinexus.registry.massive.cybercontroller8031;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cybercontroller8031")
public class CyberController8031Controller {
    private final CyberController8031Service service;
    
    public CyberController8031Controller(CyberController8031Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberController8031> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberController8031 create(@RequestBody CyberController8031 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberController8031";
    }
}
