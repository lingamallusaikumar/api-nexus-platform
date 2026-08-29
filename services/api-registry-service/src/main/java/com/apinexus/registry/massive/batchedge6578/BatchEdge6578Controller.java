package com.apinexus.registry.massive.batchedge6578;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchedge6578")
public class BatchEdge6578Controller {
    private final BatchEdge6578Service service;
    
    public BatchEdge6578Controller(BatchEdge6578Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchEdge6578> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchEdge6578 create(@RequestBody BatchEdge6578 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchEdge6578";
    }
}
