package com.apinexus.registry.massive.gridflow8885;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridflow8885")
public class GridFlow8885Controller {
    private final GridFlow8885Service service;
    
    public GridFlow8885Controller(GridFlow8885Service service) { this.service = service; }
    
    @GetMapping
    public List<GridFlow8885> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridFlow8885 create(@RequestBody GridFlow8885 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridFlow8885";
    }
}
