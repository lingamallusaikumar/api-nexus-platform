package com.apinexus.registry.massive.remoteworker7647;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remoteworker7647")
public class RemoteWorker7647Controller {
    private final RemoteWorker7647Service service;
    
    public RemoteWorker7647Controller(RemoteWorker7647Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteWorker7647> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteWorker7647 create(@RequestBody RemoteWorker7647 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteWorker7647";
    }
}
