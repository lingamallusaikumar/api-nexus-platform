package com.apinexus.registry.massive.asyncgateway1034;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncgateway1034")
public class AsyncGateway1034Controller {
    private final AsyncGateway1034Service service;
    
    public AsyncGateway1034Controller(AsyncGateway1034Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncGateway1034> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncGateway1034 create(@RequestBody AsyncGateway1034 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncGateway1034";
    }
}
