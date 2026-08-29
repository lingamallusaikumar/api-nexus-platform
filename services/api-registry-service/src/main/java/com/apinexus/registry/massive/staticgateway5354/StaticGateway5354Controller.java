package com.apinexus.registry.massive.staticgateway5354;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/staticgateway5354")
public class StaticGateway5354Controller {
    private final StaticGateway5354Service service;
    
    public StaticGateway5354Controller(StaticGateway5354Service service) { this.service = service; }
    
    @GetMapping
    public List<StaticGateway5354> getAll() { return service.findAll(); }
    
    @PostMapping
    public StaticGateway5354 create(@RequestBody StaticGateway5354 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed StaticGateway5354";
    }
}
