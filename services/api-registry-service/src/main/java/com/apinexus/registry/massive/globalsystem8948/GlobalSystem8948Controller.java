package com.apinexus.registry.massive.globalsystem8948;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalsystem8948")
public class GlobalSystem8948Controller {
    private final GlobalSystem8948Service service;
    
    public GlobalSystem8948Controller(GlobalSystem8948Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalSystem8948> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalSystem8948 create(@RequestBody GlobalSystem8948 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalSystem8948";
    }
}
