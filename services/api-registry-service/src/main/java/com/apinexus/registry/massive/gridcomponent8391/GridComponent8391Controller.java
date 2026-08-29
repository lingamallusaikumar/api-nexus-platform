package com.apinexus.registry.massive.gridcomponent8391;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridcomponent8391")
public class GridComponent8391Controller {
    private final GridComponent8391Service service;
    
    public GridComponent8391Controller(GridComponent8391Service service) { this.service = service; }
    
    @GetMapping
    public List<GridComponent8391> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridComponent8391 create(@RequestBody GridComponent8391 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridComponent8391";
    }
}
