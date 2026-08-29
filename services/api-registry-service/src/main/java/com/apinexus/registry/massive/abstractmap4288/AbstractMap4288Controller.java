package com.apinexus.registry.massive.abstractmap4288;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractmap4288")
public class AbstractMap4288Controller {
    private final AbstractMap4288Service service;
    
    public AbstractMap4288Controller(AbstractMap4288Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractMap4288> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractMap4288 create(@RequestBody AbstractMap4288 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractMap4288";
    }
}
