package com.apinexus.registry.massive.dynamicgraph3428;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicgraph3428")
public class DynamicGraph3428Controller {
    private final DynamicGraph3428Service service;
    
    public DynamicGraph3428Controller(DynamicGraph3428Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicGraph3428> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicGraph3428 create(@RequestBody DynamicGraph3428 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicGraph3428";
    }
}
