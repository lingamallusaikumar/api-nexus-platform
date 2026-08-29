package com.apinexus.registry.massive.asyncedge9344;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncedge9344")
public class AsyncEdge9344Controller {
    private final AsyncEdge9344Service service;
    
    public AsyncEdge9344Controller(AsyncEdge9344Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncEdge9344> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncEdge9344 create(@RequestBody AsyncEdge9344 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncEdge9344";
    }
}
