package com.apinexus.registry.massive.onlinegateway4460;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinegateway4460")
public class OnlineGateway4460Controller {
    private final OnlineGateway4460Service service;
    
    public OnlineGateway4460Controller(OnlineGateway4460Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineGateway4460> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineGateway4460 create(@RequestBody OnlineGateway4460 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineGateway4460";
    }
}
