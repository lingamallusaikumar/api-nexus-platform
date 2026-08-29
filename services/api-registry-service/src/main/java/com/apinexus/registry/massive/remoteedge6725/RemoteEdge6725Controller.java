package com.apinexus.registry.massive.remoteedge6725;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remoteedge6725")
public class RemoteEdge6725Controller {
    private final RemoteEdge6725Service service;
    
    public RemoteEdge6725Controller(RemoteEdge6725Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteEdge6725> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteEdge6725 create(@RequestBody RemoteEdge6725 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteEdge6725";
    }
}
