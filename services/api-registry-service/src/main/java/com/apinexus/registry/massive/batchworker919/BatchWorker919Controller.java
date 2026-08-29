package com.apinexus.registry.massive.batchworker919;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchworker919")
public class BatchWorker919Controller {
    private final BatchWorker919Service service;
    
    public BatchWorker919Controller(BatchWorker919Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchWorker919> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchWorker919 create(@RequestBody BatchWorker919 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchWorker919";
    }
}
