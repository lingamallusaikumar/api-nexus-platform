package com.apinexus.registry.massive.routernode3334;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routernode3334")
public class RouterNode3334Controller {
    private final RouterNode3334Service service;
    
    public RouterNode3334Controller(RouterNode3334Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterNode3334> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterNode3334 create(@RequestBody RouterNode3334 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterNode3334";
    }
}
