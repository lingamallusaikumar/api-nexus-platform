package com.apinexus.registry.massive.routerservice7681;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerservice7681")
public class RouterService7681Controller {
    private final RouterService7681Service service;
    
    public RouterService7681Controller(RouterService7681Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterService7681> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterService7681 create(@RequestBody RouterService7681 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterService7681";
    }
}
