package com.apinexus.registry.massive.routerjob2581;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerjob2581")
public class RouterJob2581Controller {
    private final RouterJob2581Service service;
    
    public RouterJob2581Controller(RouterJob2581Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterJob2581> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterJob2581 create(@RequestBody RouterJob2581 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterJob2581";
    }
}
