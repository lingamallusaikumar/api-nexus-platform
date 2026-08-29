package com.apinexus.registry.massive.edgelist7363;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgelist7363")
public class EdgeList7363Controller {
    private final EdgeList7363Service service;
    
    public EdgeList7363Controller(EdgeList7363Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeList7363> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeList7363 create(@RequestBody EdgeList7363 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeList7363";
    }
}
