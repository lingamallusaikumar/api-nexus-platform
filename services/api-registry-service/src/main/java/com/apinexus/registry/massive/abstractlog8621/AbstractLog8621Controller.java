package com.apinexus.registry.massive.abstractlog8621;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractlog8621")
public class AbstractLog8621Controller {
    private final AbstractLog8621Service service;
    
    public AbstractLog8621Controller(AbstractLog8621Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractLog8621> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractLog8621 create(@RequestBody AbstractLog8621 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractLog8621";
    }
}
