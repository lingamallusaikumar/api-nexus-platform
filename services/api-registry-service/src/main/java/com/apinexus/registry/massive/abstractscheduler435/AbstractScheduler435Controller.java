package com.apinexus.registry.massive.abstractscheduler435;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractscheduler435")
public class AbstractScheduler435Controller {
    private final AbstractScheduler435Service service;
    
    public AbstractScheduler435Controller(AbstractScheduler435Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractScheduler435> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractScheduler435 create(@RequestBody AbstractScheduler435 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractScheduler435";
    }
}
