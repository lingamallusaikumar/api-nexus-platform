package com.apinexus.registry.massive.batchbuffer3327;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchbuffer3327")
public class BatchBuffer3327Controller {
    private final BatchBuffer3327Service service;
    
    public BatchBuffer3327Controller(BatchBuffer3327Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchBuffer3327> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchBuffer3327 create(@RequestBody BatchBuffer3327 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchBuffer3327";
    }
}
