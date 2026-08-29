package com.apinexus.registry.massive.gridset8696;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridset8696")
public class GridSet8696Controller {
    private final GridSet8696Service service;
    
    public GridSet8696Controller(GridSet8696Service service) { this.service = service; }
    
    @GetMapping
    public List<GridSet8696> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridSet8696 create(@RequestBody GridSet8696 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridSet8696";
    }
}
