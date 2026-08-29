package com.apinexus.registry.massive.remoteflow9374;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remoteflow9374")
public class RemoteFlow9374Controller {
    private final RemoteFlow9374Service service;
    
    public RemoteFlow9374Controller(RemoteFlow9374Service service) { this.service = service; }
    
    @GetMapping
    public List<RemoteFlow9374> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemoteFlow9374 create(@RequestBody RemoteFlow9374 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemoteFlow9374";
    }
}
