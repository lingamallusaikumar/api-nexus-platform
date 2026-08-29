package com.apinexus.registry.massive.asyncroute9948;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncroute9948")
public class AsyncRoute9948Controller {
    private final AsyncRoute9948Service service;
    
    public AsyncRoute9948Controller(AsyncRoute9948Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncRoute9948> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncRoute9948 create(@RequestBody AsyncRoute9948 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncRoute9948";
    }
}
