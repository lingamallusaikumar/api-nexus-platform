package com.apinexus.registry.massive.abstractsystem2207;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractsystem2207")
public class AbstractSystem2207Controller {
    private final AbstractSystem2207Service service;
    
    public AbstractSystem2207Controller(AbstractSystem2207Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractSystem2207> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractSystem2207 create(@RequestBody AbstractSystem2207 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractSystem2207";
    }
}
