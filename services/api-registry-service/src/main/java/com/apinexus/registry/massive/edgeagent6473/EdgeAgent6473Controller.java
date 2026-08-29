package com.apinexus.registry.massive.edgeagent6473;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeagent6473")
public class EdgeAgent6473Controller {
    private final EdgeAgent6473Service service;
    
    public EdgeAgent6473Controller(EdgeAgent6473Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeAgent6473> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeAgent6473 create(@RequestBody EdgeAgent6473 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeAgent6473";
    }
}
