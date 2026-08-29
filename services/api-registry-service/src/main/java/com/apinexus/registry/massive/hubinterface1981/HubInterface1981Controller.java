package com.apinexus.registry.massive.hubinterface1981;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubinterface1981")
public class HubInterface1981Controller {
    private final HubInterface1981Service service;
    
    public HubInterface1981Controller(HubInterface1981Service service) { this.service = service; }
    
    @GetMapping
    public List<HubInterface1981> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubInterface1981 create(@RequestBody HubInterface1981 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubInterface1981";
    }
}
