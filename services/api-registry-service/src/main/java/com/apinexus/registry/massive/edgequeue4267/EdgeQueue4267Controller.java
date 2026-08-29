package com.apinexus.registry.massive.edgequeue4267;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgequeue4267")
public class EdgeQueue4267Controller {
    private final EdgeQueue4267Service service;
    
    public EdgeQueue4267Controller(EdgeQueue4267Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeQueue4267> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeQueue4267 create(@RequestBody EdgeQueue4267 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeQueue4267";
    }
}
