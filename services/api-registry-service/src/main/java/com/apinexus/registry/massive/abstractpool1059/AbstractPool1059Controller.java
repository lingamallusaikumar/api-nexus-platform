package com.apinexus.registry.massive.abstractpool1059;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractpool1059")
public class AbstractPool1059Controller {
    private final AbstractPool1059Service service;
    
    public AbstractPool1059Controller(AbstractPool1059Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractPool1059> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractPool1059 create(@RequestBody AbstractPool1059 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractPool1059";
    }
}
