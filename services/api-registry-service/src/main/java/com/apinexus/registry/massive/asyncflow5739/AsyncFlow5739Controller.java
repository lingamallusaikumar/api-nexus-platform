package com.apinexus.registry.massive.asyncflow5739;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncflow5739")
public class AsyncFlow5739Controller {
    private final AsyncFlow5739Service service;
    
    public AsyncFlow5739Controller(AsyncFlow5739Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncFlow5739> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncFlow5739 create(@RequestBody AsyncFlow5739 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncFlow5739";
    }
}
