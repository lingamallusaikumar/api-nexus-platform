package com.apinexus.registry.massive.localrepo5377;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localrepo5377")
public class LocalRepo5377Controller {
    private final LocalRepo5377Service service;
    
    public LocalRepo5377Controller(LocalRepo5377Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalRepo5377> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalRepo5377 create(@RequestBody LocalRepo5377 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalRepo5377";
    }
}
