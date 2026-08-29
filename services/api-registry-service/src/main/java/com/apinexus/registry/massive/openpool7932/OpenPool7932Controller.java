package com.apinexus.registry.massive.openpool7932;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openpool7932")
public class OpenPool7932Controller {
    private final OpenPool7932Service service;
    
    public OpenPool7932Controller(OpenPool7932Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenPool7932> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenPool7932 create(@RequestBody OpenPool7932 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenPool7932";
    }
}
