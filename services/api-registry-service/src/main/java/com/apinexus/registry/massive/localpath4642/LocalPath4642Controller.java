package com.apinexus.registry.massive.localpath4642;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localpath4642")
public class LocalPath4642Controller {
    private final LocalPath4642Service service;
    
    public LocalPath4642Controller(LocalPath4642Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalPath4642> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalPath4642 create(@RequestBody LocalPath4642 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalPath4642";
    }
}
