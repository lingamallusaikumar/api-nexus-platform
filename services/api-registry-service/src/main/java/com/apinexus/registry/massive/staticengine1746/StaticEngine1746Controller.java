package com.apinexus.registry.massive.staticengine1746;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticengine1746")
public class StaticEngine1746Controller {
    private final StaticEngine1746Service service;
    
    public StaticEngine1746Controller(StaticEngine1746Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticEngine1746> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticEngine1746 create(@RequestBody StaticEngine1746 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticEngine1746";
    }
}
