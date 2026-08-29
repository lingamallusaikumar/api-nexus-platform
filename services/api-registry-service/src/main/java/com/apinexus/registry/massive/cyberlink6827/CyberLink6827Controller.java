package com.apinexus.registry.massive.cyberlink6827;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberlink6827")
public class CyberLink6827Controller {
    private final CyberLink6827Service service;
    
    public CyberLink6827Controller(CyberLink6827Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberLink6827> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberLink6827 create(@RequestBody CyberLink6827 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberLink6827";
    }
}
