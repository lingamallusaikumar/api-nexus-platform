package com.apinexus.registry.massive.cyberentry7981;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberentry7981")
public class CyberEntry7981Controller {
    private final CyberEntry7981Service service;
    
    public CyberEntry7981Controller(CyberEntry7981Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberEntry7981> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberEntry7981 create(@RequestBody CyberEntry7981 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberEntry7981";
    }
}
