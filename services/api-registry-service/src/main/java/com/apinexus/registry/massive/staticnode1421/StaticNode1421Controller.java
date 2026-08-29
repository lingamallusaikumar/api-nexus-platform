package com.apinexus.registry.massive.staticnode1421;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticnode1421")
public class StaticNode1421Controller {
    private final StaticNode1421Service service;
    
    public StaticNode1421Controller(StaticNode1421Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticNode1421> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticNode1421 create(@RequestBody StaticNode1421 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticNode1421";
    }
}
