package com.apinexus.registry.massive.abstractprocessor3015;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractprocessor3015")
public class AbstractProcessor3015Controller {
    private final AbstractProcessor3015Service service;
    
    public AbstractProcessor3015Controller(AbstractProcessor3015Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractProcessor3015> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractProcessor3015 create(@RequestBody AbstractProcessor3015 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractProcessor3015";
    }
}
