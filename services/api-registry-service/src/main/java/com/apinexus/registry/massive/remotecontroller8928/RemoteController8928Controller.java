package com.apinexus.registry.massive.remotecontroller8928;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remotecontroller8928")
public class RemoteController8928Controller {
    private final RemoteController8928Service service;
    
    public RemoteController8928Controller(RemoteController8928Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteController8928> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteController8928 create(@RequestBody RemoteController8928 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteController8928";
    }
}
