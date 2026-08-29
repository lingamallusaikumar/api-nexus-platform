package com.apinexus.registry.massive.openagent9839;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openagent9839")
public class OpenAgent9839Controller {
    private final OpenAgent9839Service service;
    
    public OpenAgent9839Controller(OpenAgent9839Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenAgent9839> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenAgent9839 create(@RequestBody OpenAgent9839 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenAgent9839";
    }
}
