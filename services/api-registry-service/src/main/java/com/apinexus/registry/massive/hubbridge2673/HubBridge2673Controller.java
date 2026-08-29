package com.apinexus.registry.massive.hubbridge2673;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubbridge2673")
public class HubBridge2673Controller {
    private final HubBridge2673Service service;
    
    public HubBridge2673Controller(HubBridge2673Service service) { this.service = service; }
    
    @GetMapping
    public List<HubBridge2673> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubBridge2673 create(@RequestBody HubBridge2673 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubBridge2673";
    }
}
