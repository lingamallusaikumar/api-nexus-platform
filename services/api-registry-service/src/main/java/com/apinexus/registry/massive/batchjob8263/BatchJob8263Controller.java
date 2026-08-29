package com.apinexus.registry.massive.batchjob8263;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchjob8263")
public class BatchJob8263Controller {
    private final BatchJob8263Service service;
    
    public BatchJob8263Controller(BatchJob8263Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchJob8263> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchJob8263 create(@RequestBody BatchJob8263 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchJob8263";
    }
}
