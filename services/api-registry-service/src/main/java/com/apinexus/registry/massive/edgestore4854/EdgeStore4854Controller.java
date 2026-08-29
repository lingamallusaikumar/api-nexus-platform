package com.apinexus.registry.massive.edgestore4854;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgestore4854")
public class EdgeStore4854Controller {
    private final EdgeStore4854Service service;
    
    public EdgeStore4854Controller(EdgeStore4854Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeStore4854> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeStore4854 create(@RequestBody EdgeStore4854 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeStore4854";
    }
}
