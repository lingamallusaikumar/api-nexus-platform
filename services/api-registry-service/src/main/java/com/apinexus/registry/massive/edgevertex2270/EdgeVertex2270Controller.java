package com.apinexus.registry.massive.edgevertex2270;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgevertex2270")
public class EdgeVertex2270Controller {
    private final EdgeVertex2270Service service;
    
    public EdgeVertex2270Controller(EdgeVertex2270Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeVertex2270> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeVertex2270 create(@RequestBody EdgeVertex2270 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeVertex2270";
    }
}
