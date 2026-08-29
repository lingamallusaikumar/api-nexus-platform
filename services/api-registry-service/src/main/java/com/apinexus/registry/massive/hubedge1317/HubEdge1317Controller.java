package com.apinexus.registry.massive.hubedge1317;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubedge1317")
public class HubEdge1317Controller {
    private final HubEdge1317Service service;
    
    public HubEdge1317Controller(HubEdge1317Service service) { this.service = service; }
    
    @GetMapping
    public List<HubEdge1317> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubEdge1317 create(@RequestBody HubEdge1317 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubEdge1317";
    }
}
