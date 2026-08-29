package com.apinexus.registry.massive.batchprocessor5274;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchprocessor5274")
public class BatchProcessor5274Controller {
    private final BatchProcessor5274Service service;
    
    public BatchProcessor5274Controller(BatchProcessor5274Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchProcessor5274> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchProcessor5274 create(@RequestBody BatchProcessor5274 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchProcessor5274";
    }
}
