package com.apinexus.registry.massive.gridtask5907;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridtask5907")
public class GridTask5907Controller {
    private final GridTask5907Service service;
    
    public GridTask5907Controller(GridTask5907Service service) { this.service = service; }
    
    @GetMapping
    public List<GridTask5907> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridTask5907 create(@RequestBody GridTask5907 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridTask5907";
    }
}
