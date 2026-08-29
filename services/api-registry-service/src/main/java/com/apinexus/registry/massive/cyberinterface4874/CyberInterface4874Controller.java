package com.apinexus.registry.massive.cyberinterface4874;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberinterface4874")
public class CyberInterface4874Controller {
    private final CyberInterface4874Service service;
    
    public CyberInterface4874Controller(CyberInterface4874Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberInterface4874> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberInterface4874 create(@RequestBody CyberInterface4874 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberInterface4874";
    }
}
