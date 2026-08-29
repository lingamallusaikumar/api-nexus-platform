package com.apinexus.registry.massive.edgeagent4149;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeagent4149")
public class EdgeAgent4149Controller {
    private final EdgeAgent4149Service service;
    
    public EdgeAgent4149Controller(EdgeAgent4149Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeAgent4149> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeAgent4149 create(@RequestBody EdgeAgent4149 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeAgent4149";
    }
}
