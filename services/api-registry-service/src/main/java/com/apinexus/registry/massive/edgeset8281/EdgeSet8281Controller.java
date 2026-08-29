package com.apinexus.registry.massive.edgeset8281;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeset8281")
public class EdgeSet8281Controller {
    private final EdgeSet8281Service service;
    
    public EdgeSet8281Controller(EdgeSet8281Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeSet8281> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeSet8281 create(@RequestBody EdgeSet8281 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeSet8281";
    }
}
