package com.apinexus.registry.massive.remoterepo2034;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remoterepo2034")
public class RemoteRepo2034Controller {
    private final RemoteRepo2034Service service;
    
    public RemoteRepo2034Controller(RemoteRepo2034Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteRepo2034> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteRepo2034 create(@RequestBody RemoteRepo2034 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteRepo2034";
    }
}
