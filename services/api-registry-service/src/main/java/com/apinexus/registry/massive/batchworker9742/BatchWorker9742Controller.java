package com.apinexus.registry.massive.batchworker9742;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchworker9742")
public class BatchWorker9742Controller {
    private final BatchWorker9742Service service;
    
    public BatchWorker9742Controller(BatchWorker9742Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchWorker9742> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchWorker9742 create(@RequestBody BatchWorker9742 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchWorker9742";
    }
}
