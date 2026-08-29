package com.apinexus.registry.massive.realtimemap4589;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/realtimemap4589")
public class RealtimeMap4589Controller {
    private final RealtimeMap4589Service service;
    
    public RealtimeMap4589Controller(RealtimeMap4589Service service) { this.service = service; }
    
    @GetMapping
    public List<RealtimeMap4589> getAll() { return service.findAll(); }
    
    @PostMapping
    public RealtimeMap4589 create(@RequestBody RealtimeMap4589 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RealtimeMap4589";
    }
}
