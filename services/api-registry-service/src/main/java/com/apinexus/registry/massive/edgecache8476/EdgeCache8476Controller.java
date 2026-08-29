package com.apinexus.registry.massive.edgecache8476;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgecache8476")
public class EdgeCache8476Controller {
    private final EdgeCache8476Service service;
    
    public EdgeCache8476Controller(EdgeCache8476Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeCache8476> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeCache8476 create(@RequestBody EdgeCache8476 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeCache8476";
    }
}
