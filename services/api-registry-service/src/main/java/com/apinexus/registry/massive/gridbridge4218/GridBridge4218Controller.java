package com.apinexus.registry.massive.gridbridge4218;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridbridge4218")
public class GridBridge4218Controller {
    private final GridBridge4218Service service;
    
    public GridBridge4218Controller(GridBridge4218Service service) { this.service = service; }
    
    @GetMapping
    public List<GridBridge4218> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridBridge4218 create(@RequestBody GridBridge4218 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridBridge4218";
    }
}
