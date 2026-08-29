package com.apinexus.registry.massive.asynchandler2723;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asynchandler2723")
public class AsyncHandler2723Controller {
    private final AsyncHandler2723Service service;
    
    public AsyncHandler2723Controller(AsyncHandler2723Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncHandler2723> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncHandler2723 create(@RequestBody AsyncHandler2723 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncHandler2723";
    }
}
