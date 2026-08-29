package com.apinexus.registry.massive.asynccomponent2746;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asynccomponent2746")
public class AsyncComponent2746Controller {
    private final AsyncComponent2746Service service;
    
    public AsyncComponent2746Controller(AsyncComponent2746Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncComponent2746> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncComponent2746 create(@RequestBody AsyncComponent2746 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncComponent2746";
    }
}
