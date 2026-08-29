package com.apinexus.registry.massive.edgeset9408;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeset9408")
public class EdgeSet9408Controller {
    private final EdgeSet9408Service service;
    
    public EdgeSet9408Controller(EdgeSet9408Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeSet9408> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeSet9408 create(@RequestBody EdgeSet9408 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeSet9408";
    }
}
