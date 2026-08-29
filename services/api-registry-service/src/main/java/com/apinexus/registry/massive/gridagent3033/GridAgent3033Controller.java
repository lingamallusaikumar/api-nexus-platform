package com.apinexus.registry.massive.gridagent3033;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridagent3033")
public class GridAgent3033Controller {
    private final GridAgent3033Service service;
    
    public GridAgent3033Controller(GridAgent3033Service service) { this.service = service; }
    
    @GetMapping
    public List<GridAgent3033> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridAgent3033 create(@RequestBody GridAgent3033 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridAgent3033";
    }
}
