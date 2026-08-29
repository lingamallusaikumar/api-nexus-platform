package com.apinexus.registry.massive.openflow770;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/openflow770")
public class OpenFlow770Controller {
    private final OpenFlow770Service service;
    
    public OpenFlow770Controller(OpenFlow770Service service) { this.service = service; }
    
    @GetMapping
    public List<OpenFlow770> getAll() { return service.findAll(); }
    
    @PostMapping
    public OpenFlow770 create(@RequestBody OpenFlow770 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OpenFlow770";
    }
}
