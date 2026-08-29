package com.apinexus.registry.massive.asyncedge7815;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncedge7815")
public class AsyncEdge7815Controller {
    private final AsyncEdge7815Service service;
    
    public AsyncEdge7815Controller(AsyncEdge7815Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncEdge7815> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncEdge7815 create(@RequestBody AsyncEdge7815 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncEdge7815";
    }
}
