package com.apinexus.registry.massive.edgerepo5804;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgerepo5804")
public class EdgeRepo5804Controller {
    private final EdgeRepo5804Service service;
    
    public EdgeRepo5804Controller(EdgeRepo5804Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeRepo5804> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeRepo5804 create(@RequestBody EdgeRepo5804 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeRepo5804";
    }
}
