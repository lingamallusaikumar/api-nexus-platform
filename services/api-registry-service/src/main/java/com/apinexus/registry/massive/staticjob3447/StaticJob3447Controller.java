package com.apinexus.registry.massive.staticjob3447;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticjob3447")
public class StaticJob3447Controller {
    private final StaticJob3447Service service;
    
    public StaticJob3447Controller(StaticJob3447Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticJob3447> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticJob3447 create(@RequestBody StaticJob3447 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticJob3447";
    }
}
