package com.apinexus.registry.massive.abstractagent956;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractagent956")
public class AbstractAgent956Controller {
    private final AbstractAgent956Service service;
    
    public AbstractAgent956Controller(AbstractAgent956Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractAgent956> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractAgent956 create(@RequestBody AbstractAgent956 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractAgent956";
    }
}
