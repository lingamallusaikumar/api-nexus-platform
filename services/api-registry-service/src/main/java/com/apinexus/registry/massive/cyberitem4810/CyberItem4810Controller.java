package com.apinexus.registry.massive.cyberitem4810;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberitem4810")
public class CyberItem4810Controller {
    private final CyberItem4810Service service;
    
    public CyberItem4810Controller(CyberItem4810Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberItem4810> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberItem4810 create(@RequestBody CyberItem4810 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberItem4810";
    }
}
