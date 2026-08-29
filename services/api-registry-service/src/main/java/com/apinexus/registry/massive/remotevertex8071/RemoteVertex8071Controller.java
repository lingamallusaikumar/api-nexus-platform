package com.apinexus.registry.massive.remotevertex8071;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remotevertex8071")
public class RemoteVertex8071Controller {
    private final RemoteVertex8071Service service;
    
    public RemoteVertex8071Controller(RemoteVertex8071Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteVertex8071> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteVertex8071 create(@RequestBody RemoteVertex8071 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteVertex8071";
    }
}
