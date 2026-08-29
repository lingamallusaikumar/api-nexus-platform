package com.apinexus.registry.massive.asynccontroller9233;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asynccontroller9233")
public class AsyncController9233Controller {
    private final AsyncController9233Service service;
    
    public AsyncController9233Controller(AsyncController9233Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncController9233> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncController9233 create(@RequestBody AsyncController9233 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncController9233";
    }
}
