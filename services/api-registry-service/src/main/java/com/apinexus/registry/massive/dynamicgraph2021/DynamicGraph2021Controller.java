package com.apinexus.registry.massive.dynamicgraph2021;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicgraph2021")
public class DynamicGraph2021Controller {
    private final DynamicGraph2021Service service;
    
    public DynamicGraph2021Controller(DynamicGraph2021Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicGraph2021> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicGraph2021 create(@RequestBody DynamicGraph2021 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicGraph2021";
    }
}
