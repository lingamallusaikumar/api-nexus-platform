package com.apinexus.registry.massive.asyncitem596;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncitem596")
public class AsyncItem596Controller {
    private final AsyncItem596Service service;
    
    public AsyncItem596Controller(AsyncItem596Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncItem596> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncItem596 create(@RequestBody AsyncItem596 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncItem596";
    }
}
