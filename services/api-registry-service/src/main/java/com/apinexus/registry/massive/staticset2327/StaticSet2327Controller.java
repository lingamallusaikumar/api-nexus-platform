package com.apinexus.registry.massive.staticset2327;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticset2327")
public class StaticSet2327Controller {
    private final StaticSet2327Service service;
    
    public StaticSet2327Controller(StaticSet2327Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticSet2327> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticSet2327 create(@RequestBody StaticSet2327 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticSet2327";
    }
}
