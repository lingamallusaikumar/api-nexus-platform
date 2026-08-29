package com.apinexus.registry.massive.abstractcache3982;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractcache3982")
public class AbstractCache3982Controller {
    private final AbstractCache3982Service service;
    
    public AbstractCache3982Controller(AbstractCache3982Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractCache3982> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractCache3982 create(@RequestBody AbstractCache3982 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractCache3982";
    }
}
