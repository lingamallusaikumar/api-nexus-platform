package com.apinexus.registry.massive.cybernode1186;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cybernode1186")
public class CyberNode1186Controller {
    private final CyberNode1186Service service;
    
    public CyberNode1186Controller(CyberNode1186Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberNode1186> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberNode1186 create(@RequestBody CyberNode1186 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberNode1186";
    }
}
