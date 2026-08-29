package com.apinexus.registry.massive.cyberprocess8743;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberprocess8743")
public class CyberProcess8743Controller {
    private final CyberProcess8743Service service;
    
    public CyberProcess8743Controller(CyberProcess8743Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberProcess8743> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberProcess8743 create(@RequestBody CyberProcess8743 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberProcess8743";
    }
}
