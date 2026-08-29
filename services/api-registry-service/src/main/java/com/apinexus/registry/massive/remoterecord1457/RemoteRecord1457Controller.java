package com.apinexus.registry.massive.remoterecord1457;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remoterecord1457")
public class RemoteRecord1457Controller {
    private final RemoteRecord1457Service service;
    
    public RemoteRecord1457Controller(RemoteRecord1457Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteRecord1457> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteRecord1457 create(@RequestBody RemoteRecord1457 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteRecord1457";
    }
}
