package com.apinexus.registry.massive.asyncmodule7353;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncmodule7353")
public class AsyncModule7353Controller {
    private final AsyncModule7353Service service;
    
    public AsyncModule7353Controller(AsyncModule7353Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncModule7353> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncModule7353 create(@RequestBody AsyncModule7353 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncModule7353";
    }
}
