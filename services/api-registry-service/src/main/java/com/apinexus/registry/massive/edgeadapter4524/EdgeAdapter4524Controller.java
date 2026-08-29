package com.apinexus.registry.massive.edgeadapter4524;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgeadapter4524")
public class EdgeAdapter4524Controller {
    private final EdgeAdapter4524Service service;
    
    public EdgeAdapter4524Controller(EdgeAdapter4524Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeAdapter4524> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeAdapter4524 create(@RequestBody EdgeAdapter4524 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeAdapter4524";
    }
}
