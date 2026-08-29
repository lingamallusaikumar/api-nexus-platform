package com.apinexus.registry.massive.asynctree787;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asynctree787")
public class AsyncTree787Controller {
    private final AsyncTree787Service service;
    
    public AsyncTree787Controller(AsyncTree787Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncTree787> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncTree787 create(@RequestBody AsyncTree787 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncTree787";
    }
}
