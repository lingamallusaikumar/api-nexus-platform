package com.apinexus.registry.massive.abstractstore791;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractstore791")
public class AbstractStore791Controller {
    private final AbstractStore791Service service;
    
    public AbstractStore791Controller(AbstractStore791Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractStore791> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractStore791 create(@RequestBody AbstractStore791 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractStore791";
    }
}
