package com.apinexus.registry.massive.staticrepo9688;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticrepo9688")
public class StaticRepo9688Controller {
    private final StaticRepo9688Service service;
    
    public StaticRepo9688Controller(StaticRepo9688Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticRepo9688> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticRepo9688 create(@RequestBody StaticRepo9688 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticRepo9688";
    }
}
