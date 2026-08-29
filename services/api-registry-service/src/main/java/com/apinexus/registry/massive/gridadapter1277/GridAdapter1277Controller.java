package com.apinexus.registry.massive.gridadapter1277;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridadapter1277")
public class GridAdapter1277Controller {
    private final GridAdapter1277Service service;
    
    public GridAdapter1277Controller(GridAdapter1277Service service) { this.service = service; }
    
    @GetMapping
    public List<GridAdapter1277> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridAdapter1277 create(@RequestBody GridAdapter1277 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridAdapter1277";
    }
}
