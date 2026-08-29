package com.apinexus.registry.massive.localagent7777;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localagent7777")
public class LocalAgent7777Controller {
    private final LocalAgent7777Service service;
    
    public LocalAgent7777Controller(LocalAgent7777Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalAgent7777> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalAgent7777 create(@RequestBody LocalAgent7777 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalAgent7777";
    }
}
