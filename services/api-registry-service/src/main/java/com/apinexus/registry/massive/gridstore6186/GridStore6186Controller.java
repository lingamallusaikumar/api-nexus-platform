package com.apinexus.registry.massive.gridstore6186;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridstore6186")
public class GridStore6186Controller {
    private final GridStore6186Service service;
    
    public GridStore6186Controller(GridStore6186Service service) { this.service = service; }
    
    @GetMapping
    public List<GridStore6186> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridStore6186 create(@RequestBody GridStore6186 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridStore6186";
    }
}
