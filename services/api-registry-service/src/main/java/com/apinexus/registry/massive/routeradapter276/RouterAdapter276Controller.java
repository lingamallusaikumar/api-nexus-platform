package com.apinexus.registry.massive.routeradapter276;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routeradapter276")
public class RouterAdapter276Controller {
    private final RouterAdapter276Service service;
    
    public RouterAdapter276Controller(RouterAdapter276Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterAdapter276> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterAdapter276 create(@RequestBody RouterAdapter276 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterAdapter276";
    }
}
