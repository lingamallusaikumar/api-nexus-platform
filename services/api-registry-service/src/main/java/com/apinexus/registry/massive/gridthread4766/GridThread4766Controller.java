package com.apinexus.registry.massive.gridthread4766;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridthread4766")
public class GridThread4766Controller {
    private final GridThread4766Service service;
    
    public GridThread4766Controller(GridThread4766Service service) { this.service = service; }
    
    @GetMapping
    public List<GridThread4766> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridThread4766 create(@RequestBody GridThread4766 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridThread4766";
    }
}
