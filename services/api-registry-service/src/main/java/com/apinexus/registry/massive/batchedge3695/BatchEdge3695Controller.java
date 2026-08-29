package com.apinexus.registry.massive.batchedge3695;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchedge3695")
public class BatchEdge3695Controller {
    private final BatchEdge3695Service service;
    
    public BatchEdge3695Controller(BatchEdge3695Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchEdge3695> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchEdge3695 create(@RequestBody BatchEdge3695 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchEdge3695";
    }
}
