package com.apinexus.registry.massive.asyncpool6787;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncpool6787")
public class AsyncPool6787Controller {
    private final AsyncPool6787Service service;
    
    public AsyncPool6787Controller(AsyncPool6787Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncPool6787> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncPool6787 create(@RequestBody AsyncPool6787 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncPool6787";
    }
}
