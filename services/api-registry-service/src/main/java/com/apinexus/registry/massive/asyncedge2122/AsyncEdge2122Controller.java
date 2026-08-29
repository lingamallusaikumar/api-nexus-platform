package com.apinexus.registry.massive.asyncedge2122;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncedge2122")
public class AsyncEdge2122Controller {
    private final AsyncEdge2122Service service;
    
    public AsyncEdge2122Controller(AsyncEdge2122Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncEdge2122> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncEdge2122 create(@RequestBody AsyncEdge2122 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncEdge2122";
    }
}
