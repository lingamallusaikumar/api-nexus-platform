package com.apinexus.registry.massive.remotesystem5052;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remotesystem5052")
public class RemoteSystem5052Controller {
    private final RemoteSystem5052Service service;
    
    public RemoteSystem5052Controller(RemoteSystem5052Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteSystem5052> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteSystem5052 create(@RequestBody RemoteSystem5052 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteSystem5052";
    }
}
