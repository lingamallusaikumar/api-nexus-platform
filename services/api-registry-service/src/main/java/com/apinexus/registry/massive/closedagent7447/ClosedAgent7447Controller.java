package com.apinexus.registry.massive.closedagent7447;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedagent7447")
public class ClosedAgent7447Controller {
    private final ClosedAgent7447Service service;
    
    public ClosedAgent7447Controller(ClosedAgent7447Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedAgent7447> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedAgent7447 create(@RequestBody ClosedAgent7447 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedAgent7447";
    }
}
