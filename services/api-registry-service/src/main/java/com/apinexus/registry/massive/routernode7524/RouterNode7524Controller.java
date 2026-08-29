package com.apinexus.registry.massive.routernode7524;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routernode7524")
public class RouterNode7524Controller {
    private final RouterNode7524Service service;
    
    public RouterNode7524Controller(RouterNode7524Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterNode7524> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterNode7524 create(@RequestBody RouterNode7524 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterNode7524";
    }
}
