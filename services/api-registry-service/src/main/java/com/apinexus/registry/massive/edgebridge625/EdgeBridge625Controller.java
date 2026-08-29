package com.apinexus.registry.massive.edgebridge625;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgebridge625")
public class EdgeBridge625Controller {
    private final EdgeBridge625Service service;
    
    public EdgeBridge625Controller(EdgeBridge625Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeBridge625> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeBridge625 create(@RequestBody EdgeBridge625 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeBridge625";
    }
}
