package com.apinexus.registry.massive.remotejob3163;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remotejob3163")
public class RemoteJob3163Controller {
    private final RemoteJob3163Service service;
    
    public RemoteJob3163Controller(RemoteJob3163Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteJob3163> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteJob3163 create(@RequestBody RemoteJob3163 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteJob3163";
    }
}
