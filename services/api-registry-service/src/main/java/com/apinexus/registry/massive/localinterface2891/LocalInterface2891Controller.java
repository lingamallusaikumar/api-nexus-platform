package com.apinexus.registry.massive.localinterface2891;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localinterface2891")
public class LocalInterface2891Controller {
    private final LocalInterface2891Service service;
    
    public LocalInterface2891Controller(LocalInterface2891Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalInterface2891> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalInterface2891 create(@RequestBody LocalInterface2891 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalInterface2891";
    }
}
