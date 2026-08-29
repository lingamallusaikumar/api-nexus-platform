package com.apinexus.registry.massive.batchinterface3231;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/batchinterface3231")
public class BatchInterface3231Controller {
    private final BatchInterface3231Service service;
    
    public BatchInterface3231Controller(BatchInterface3231Service service) { this.service = service; }
    
    @GetMapping
    public List<BatchInterface3231> getAll() { return service.findAll(); }
    
    @PostMapping
    public BatchInterface3231 create(@RequestBody BatchInterface3231 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed BatchInterface3231";
    }
}
