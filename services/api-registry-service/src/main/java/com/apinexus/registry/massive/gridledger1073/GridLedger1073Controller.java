package com.apinexus.registry.massive.gridledger1073;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/gridledger1073")
public class GridLedger1073Controller {
    private final GridLedger1073Service service;
    
    public GridLedger1073Controller(GridLedger1073Service service) { this.service = service; }
    
    @GetMapping
    public List<GridLedger1073> getAll() { return service.findAll(); }
    
    @PostMapping
    public GridLedger1073 create(@RequestBody GridLedger1073 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GridLedger1073";
    }
}
