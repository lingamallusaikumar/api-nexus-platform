package com.apinexus.registry.massive.gridscheduler3034;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridscheduler3034")
public class GridScheduler3034Controller {
    private final GridScheduler3034Service service;
    
    public GridScheduler3034Controller(GridScheduler3034Service service) { this.service = service; }
    
    @GetMapping
    public List<GridScheduler3034> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridScheduler3034 create(@RequestBody GridScheduler3034 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridScheduler3034";
    }
}
