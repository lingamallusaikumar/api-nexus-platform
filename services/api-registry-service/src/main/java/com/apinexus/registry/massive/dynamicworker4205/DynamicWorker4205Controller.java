package com.apinexus.registry.massive.dynamicworker4205;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicworker4205")
public class DynamicWorker4205Controller {
    private final DynamicWorker4205Service service;
    
    public DynamicWorker4205Controller(DynamicWorker4205Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicWorker4205> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicWorker4205 create(@RequestBody DynamicWorker4205 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicWorker4205";
    }
}
