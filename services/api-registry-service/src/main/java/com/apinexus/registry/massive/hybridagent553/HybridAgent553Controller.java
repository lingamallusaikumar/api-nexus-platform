package com.apinexus.registry.massive.hybridagent553;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridagent553")
public class HybridAgent553Controller {
    private final HybridAgent553Service service;
    
    public HybridAgent553Controller(HybridAgent553Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridAgent553> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridAgent553 create(@RequestBody HybridAgent553 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridAgent553";
    }
}
