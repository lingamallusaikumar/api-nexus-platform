package com.apinexus.registry.massive.gridservice3975;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridservice3975")
public class GridService3975Controller {
    private final GridService3975Service service;
    
    public GridService3975Controller(GridService3975Service service) { this.service = service; }
    
    @GetMapping
    public List<GridService3975> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridService3975 create(@RequestBody GridService3975 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridService3975";
    }
}
