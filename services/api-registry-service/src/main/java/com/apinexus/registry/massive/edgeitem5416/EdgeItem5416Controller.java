package com.apinexus.registry.massive.edgeitem5416;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeitem5416")
public class EdgeItem5416Controller {
    private final EdgeItem5416Service service;
    
    public EdgeItem5416Controller(EdgeItem5416Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeItem5416> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeItem5416 create(@RequestBody EdgeItem5416 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeItem5416";
    }
}
