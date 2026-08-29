package com.apinexus.registry.massive.remotelink4649;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remotelink4649")
public class RemoteLink4649Controller {
    private final RemoteLink4649Service service;
    
    public RemoteLink4649Controller(RemoteLink4649Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteLink4649> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteLink4649 create(@RequestBody RemoteLink4649 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteLink4649";
    }
}
