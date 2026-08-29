package com.apinexus.registry.massive.batchrepo5932;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchrepo5932")
public class BatchRepo5932Controller {
    private final BatchRepo5932Service service;
    
    public BatchRepo5932Controller(BatchRepo5932Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchRepo5932> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchRepo5932 create(@RequestBody BatchRepo5932 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchRepo5932";
    }
}
