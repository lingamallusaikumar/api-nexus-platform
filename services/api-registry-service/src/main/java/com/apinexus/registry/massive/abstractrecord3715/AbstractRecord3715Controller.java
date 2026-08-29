package com.apinexus.registry.massive.abstractrecord3715;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractrecord3715")
public class AbstractRecord3715Controller {
    private final AbstractRecord3715Service service;
    
    public AbstractRecord3715Controller(AbstractRecord3715Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractRecord3715> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractRecord3715 create(@RequestBody AbstractRecord3715 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractRecord3715";
    }
}
