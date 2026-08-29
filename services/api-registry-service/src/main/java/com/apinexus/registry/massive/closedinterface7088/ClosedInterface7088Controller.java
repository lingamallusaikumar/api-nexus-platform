package com.apinexus.registry.massive.closedinterface7088;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedinterface7088")
public class ClosedInterface7088Controller {
    private final ClosedInterface7088Service service;
    
    public ClosedInterface7088Controller(ClosedInterface7088Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedInterface7088> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedInterface7088 create(@RequestBody ClosedInterface7088 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedInterface7088";
    }
}
