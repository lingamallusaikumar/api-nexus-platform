package com.apinexus.registry.massive.asyncadapter1873;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncadapter1873")
public class AsyncAdapter1873Controller {
    private final AsyncAdapter1873Service service;
    
    public AsyncAdapter1873Controller(AsyncAdapter1873Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncAdapter1873> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncAdapter1873 create(@RequestBody AsyncAdapter1873 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncAdapter1873";
    }
}
