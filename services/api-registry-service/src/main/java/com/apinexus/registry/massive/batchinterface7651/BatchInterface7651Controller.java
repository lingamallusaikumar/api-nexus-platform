package com.apinexus.registry.massive.batchinterface7651;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchinterface7651")
public class BatchInterface7651Controller {
    private final BatchInterface7651Service service;
    
    public BatchInterface7651Controller(BatchInterface7651Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchInterface7651> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchInterface7651 create(@RequestBody BatchInterface7651 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchInterface7651";
    }
}
