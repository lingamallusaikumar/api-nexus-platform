package com.apinexus.registry.massive.closedportal4727;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedportal4727")
public class ClosedPortal4727Controller {
    private final ClosedPortal4727Service service;
    
    public ClosedPortal4727Controller(ClosedPortal4727Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedPortal4727> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedPortal4727 create(@RequestBody ClosedPortal4727 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedPortal4727";
    }
}
