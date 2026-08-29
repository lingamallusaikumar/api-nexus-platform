package com.apinexus.registry.massive.hubgateway210;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubgateway210")
public class HubGateway210Controller {
    private final HubGateway210Service service;
    
    public HubGateway210Controller(HubGateway210Service service) { this.service = service; }
    
    @GetMapping
    public List<HubGateway210> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubGateway210 create(@RequestBody HubGateway210 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubGateway210";
    }
}
