package com.apinexus.registry.massive.remoteentry6260;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remoteentry6260")
public class RemoteEntry6260Controller {
    private final RemoteEntry6260Service service;
    
    public RemoteEntry6260Controller(RemoteEntry6260Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteEntry6260> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteEntry6260 create(@RequestBody RemoteEntry6260 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteEntry6260";
    }
}
