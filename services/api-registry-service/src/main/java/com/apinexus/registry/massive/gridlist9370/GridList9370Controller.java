package com.apinexus.registry.massive.gridlist9370;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridlist9370")
public class GridList9370Controller {
    private final GridList9370Service service;
    
    public GridList9370Controller(GridList9370Service service) { this.service = service; }
    
    @GetMapping
    public List<GridList9370> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridList9370 create(@RequestBody GridList9370 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridList9370";
    }
}
