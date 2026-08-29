package com.apinexus.registry.massive.edgedatabase7399;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgedatabase7399")
public class EdgeDatabase7399Controller {
    private final EdgeDatabase7399Service service;
    
    public EdgeDatabase7399Controller(EdgeDatabase7399Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeDatabase7399> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeDatabase7399 create(@RequestBody EdgeDatabase7399 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeDatabase7399";
    }
}
