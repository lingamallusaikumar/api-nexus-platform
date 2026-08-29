package com.apinexus.registry.massive.edgetree7847;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgetree7847")
public class EdgeTree7847Controller {
    private final EdgeTree7847Service service;
    
    public EdgeTree7847Controller(EdgeTree7847Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeTree7847> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeTree7847 create(@RequestBody EdgeTree7847 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeTree7847";
    }
}
