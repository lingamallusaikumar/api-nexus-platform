package com.apinexus.registry.massive.edgegraph7460;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgegraph7460")
public class EdgeGraph7460Controller {
    private final EdgeGraph7460Service service;
    
    public EdgeGraph7460Controller(EdgeGraph7460Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeGraph7460> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeGraph7460 create(@RequestBody EdgeGraph7460 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeGraph7460";
    }
}
