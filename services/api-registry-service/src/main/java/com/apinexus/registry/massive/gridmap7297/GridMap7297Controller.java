package com.apinexus.registry.massive.gridmap7297;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridmap7297")
public class GridMap7297Controller {
    private final GridMap7297Service service;
    
    public GridMap7297Controller(GridMap7297Service service) { this.service = service; }
    
    @GetMapping
    public List<GridMap7297> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridMap7297 create(@RequestBody GridMap7297 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridMap7297";
    }
}
