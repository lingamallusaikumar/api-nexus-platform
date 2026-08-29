package com.apinexus.registry.massive.routerstack8430;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerstack8430")
public class RouterStack8430Controller {
    private final RouterStack8430Service service;
    
    public RouterStack8430Controller(RouterStack8430Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterStack8430> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterStack8430 create(@RequestBody RouterStack8430 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterStack8430";
    }
}
