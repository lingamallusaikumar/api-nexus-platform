package com.apinexus.registry.massive.closedengine3447;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedengine3447")
public class ClosedEngine3447Controller {
    private final ClosedEngine3447Service service;
    
    public ClosedEngine3447Controller(ClosedEngine3447Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedEngine3447> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedEngine3447 create(@RequestBody ClosedEngine3447 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedEngine3447";
    }
}
