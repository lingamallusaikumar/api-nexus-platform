package com.apinexus.registry.massive.routergateway5634;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routergateway5634")
public class RouterGateway5634Controller {
    private final RouterGateway5634Service service;
    
    public RouterGateway5634Controller(RouterGateway5634Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterGateway5634> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterGateway5634 create(@RequestBody RouterGateway5634 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterGateway5634";
    }
}
