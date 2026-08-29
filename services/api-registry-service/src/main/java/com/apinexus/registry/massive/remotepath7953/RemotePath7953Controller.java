package com.apinexus.registry.massive.remotepath7953;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remotepath7953")
public class RemotePath7953Controller {
    private final RemotePath7953Service service;
    
    public RemotePath7953Controller(RemotePath7953Service service) { this.service = service; }
    
    @GetMapping
    public List<RemotePath7953> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemotePath7953 create(@RequestBody RemotePath7953 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemotePath7953";
    }
}
