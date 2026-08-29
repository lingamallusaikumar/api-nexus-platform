package com.apinexus.registry.massive.asyncgateway8642;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncgateway8642")
public class AsyncGateway8642Controller {
    private final AsyncGateway8642Service service;
    
    public AsyncGateway8642Controller(AsyncGateway8642Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncGateway8642> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncGateway8642 create(@RequestBody AsyncGateway8642 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncGateway8642";
    }
}
