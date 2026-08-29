package com.apinexus.registry.massive.remoteadapter2350;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remoteadapter2350")
public class RemoteAdapter2350Controller {
    private final RemoteAdapter2350Service service;
    
    public RemoteAdapter2350Controller(RemoteAdapter2350Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteAdapter2350> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteAdapter2350 create(@RequestBody RemoteAdapter2350 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteAdapter2350";
    }
}
