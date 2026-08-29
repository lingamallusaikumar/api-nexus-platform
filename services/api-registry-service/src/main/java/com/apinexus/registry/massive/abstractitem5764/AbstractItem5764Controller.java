package com.apinexus.registry.massive.abstractitem5764;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractitem5764")
public class AbstractItem5764Controller {
    private final AbstractItem5764Service service;
    
    public AbstractItem5764Controller(AbstractItem5764Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractItem5764> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractItem5764 create(@RequestBody AbstractItem5764 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractItem5764";
    }
}
