package com.apinexus.registry.massive.cyberentry7299;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberentry7299")
public class CyberEntry7299Controller {
    private final CyberEntry7299Service service;
    
    public CyberEntry7299Controller(CyberEntry7299Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberEntry7299> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberEntry7299 create(@RequestBody CyberEntry7299 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberEntry7299";
    }
}
