package com.apinexus.registry.massive.batchbridge5004;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchbridge5004")
public class BatchBridge5004Controller {
    private final BatchBridge5004Service service;
    
    public BatchBridge5004Controller(BatchBridge5004Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchBridge5004> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchBridge5004 create(@RequestBody BatchBridge5004 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchBridge5004";
    }
}
