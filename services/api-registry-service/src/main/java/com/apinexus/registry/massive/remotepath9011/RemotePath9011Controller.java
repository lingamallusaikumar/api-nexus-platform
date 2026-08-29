package com.apinexus.registry.massive.remotepath9011;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/remotepath9011")
public class RemotePath9011Controller {
    private final RemotePath9011Service service;
    
    public RemotePath9011Controller(RemotePath9011Service service) { this.service = service; }
    
    @GetMapping
    public List<RemotePath9011> getAll() { return service.findAll(); }
    
    @PostMapping
    public RemotePath9011 create(@RequestBody RemotePath9011 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RemotePath9011";
    }
}
