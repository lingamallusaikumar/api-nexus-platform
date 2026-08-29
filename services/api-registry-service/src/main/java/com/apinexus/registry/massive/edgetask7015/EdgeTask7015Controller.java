package com.apinexus.registry.massive.edgetask7015;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgetask7015")
public class EdgeTask7015Controller {
    private final EdgeTask7015Service service;
    
    public EdgeTask7015Controller(EdgeTask7015Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeTask7015> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeTask7015 create(@RequestBody EdgeTask7015 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeTask7015";
    }
}
