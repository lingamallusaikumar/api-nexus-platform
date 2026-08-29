package com.apinexus.registry.massive.staticroute6066;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticroute6066")
public class StaticRoute6066Controller {
    private final StaticRoute6066Service service;
    
    public StaticRoute6066Controller(StaticRoute6066Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticRoute6066> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticRoute6066 create(@RequestBody StaticRoute6066 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticRoute6066";
    }
}
