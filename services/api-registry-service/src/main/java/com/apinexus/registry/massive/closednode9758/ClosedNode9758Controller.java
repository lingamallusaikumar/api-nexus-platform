package com.apinexus.registry.massive.closednode9758;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closednode9758")
public class ClosedNode9758Controller {
    private final ClosedNode9758Service service;
    
    public ClosedNode9758Controller(ClosedNode9758Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedNode9758> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedNode9758 create(@RequestBody ClosedNode9758 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedNode9758";
    }
}
