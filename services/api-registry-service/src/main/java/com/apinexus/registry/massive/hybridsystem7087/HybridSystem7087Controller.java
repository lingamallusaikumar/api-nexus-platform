package com.apinexus.registry.massive.hybridsystem7087;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hybridsystem7087")
public class HybridSystem7087Controller {
    private final HybridSystem7087Service service;
    
    public HybridSystem7087Controller(HybridSystem7087Service service) { this.service = service; }
    
    @GetMapping
    public List<HybridSystem7087> getAll() { return service.findAll(); }
    
    @PostMapping
    public HybridSystem7087 create(@RequestBody HybridSystem7087 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HybridSystem7087";
    }
}
