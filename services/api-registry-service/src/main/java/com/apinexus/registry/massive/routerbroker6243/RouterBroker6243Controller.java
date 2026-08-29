package com.apinexus.registry.massive.routerbroker6243;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerbroker6243")
public class RouterBroker6243Controller {
    private final RouterBroker6243Service service;
    
    public RouterBroker6243Controller(RouterBroker6243Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterBroker6243> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterBroker6243 create(@RequestBody RouterBroker6243 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterBroker6243";
    }
}
