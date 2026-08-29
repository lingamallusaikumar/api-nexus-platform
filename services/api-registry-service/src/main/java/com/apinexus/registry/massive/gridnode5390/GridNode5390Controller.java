package com.apinexus.registry.massive.gridnode5390;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridnode5390")
public class GridNode5390Controller {
    private final GridNode5390Service service;
    
    public GridNode5390Controller(GridNode5390Service service) { this.service = service; }
    
    @GetMapping
    public List<GridNode5390> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridNode5390 create(@RequestBody GridNode5390 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridNode5390";
    }
}
