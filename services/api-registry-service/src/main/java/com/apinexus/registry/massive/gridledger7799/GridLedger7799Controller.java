package com.apinexus.registry.massive.gridledger7799;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridledger7799")
public class GridLedger7799Controller {
    private final GridLedger7799Service service;
    
    public GridLedger7799Controller(GridLedger7799Service service) { this.service = service; }
    
    @GetMapping
    public List<GridLedger7799> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridLedger7799 create(@RequestBody GridLedger7799 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridLedger7799";
    }
}
