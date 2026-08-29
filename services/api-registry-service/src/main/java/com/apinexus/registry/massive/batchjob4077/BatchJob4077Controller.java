package com.apinexus.registry.massive.batchjob4077;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchjob4077")
public class BatchJob4077Controller {
    private final BatchJob4077Service service;
    
    public BatchJob4077Controller(BatchJob4077Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchJob4077> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchJob4077 create(@RequestBody BatchJob4077 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchJob4077";
    }
}
