package com.apinexus.registry.massive.abstractpath7370;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractpath7370")
public class AbstractPath7370Controller {
    private final AbstractPath7370Service service;
    
    public AbstractPath7370Controller(AbstractPath7370Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractPath7370> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractPath7370 create(@RequestBody AbstractPath7370 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractPath7370";
    }
}
