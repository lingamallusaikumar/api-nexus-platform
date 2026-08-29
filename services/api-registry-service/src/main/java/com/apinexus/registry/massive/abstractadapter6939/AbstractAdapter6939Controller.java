package com.apinexus.registry.massive.abstractadapter6939;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractadapter6939")
public class AbstractAdapter6939Controller {
    private final AbstractAdapter6939Service service;
    
    public AbstractAdapter6939Controller(AbstractAdapter6939Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractAdapter6939> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractAdapter6939 create(@RequestBody AbstractAdapter6939 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractAdapter6939";
    }
}
