package com.apinexus.registry.massive.edgecomponent9447;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgecomponent9447")
public class EdgeComponent9447Controller {
    private final EdgeComponent9447Service service;
    
    public EdgeComponent9447Controller(EdgeComponent9447Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeComponent9447> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeComponent9447 create(@RequestBody EdgeComponent9447 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeComponent9447";
    }
}
