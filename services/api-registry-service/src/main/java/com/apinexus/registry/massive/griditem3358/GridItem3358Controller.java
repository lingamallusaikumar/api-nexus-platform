package com.apinexus.registry.massive.griditem3358;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/griditem3358")
public class GridItem3358Controller {
    private final GridItem3358Service service;
    
    public GridItem3358Controller(GridItem3358Service service) { this.service = service; }
    
    @GetMapping
    public List<GridItem3358> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridItem3358 create(@RequestBody GridItem3358 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridItem3358";
    }
}
