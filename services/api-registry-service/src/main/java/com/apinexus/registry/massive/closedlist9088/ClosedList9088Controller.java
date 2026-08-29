package com.apinexus.registry.massive.closedlist9088;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedlist9088")
public class ClosedList9088Controller {
    private final ClosedList9088Service service;
    
    public ClosedList9088Controller(ClosedList9088Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedList9088> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedList9088 create(@RequestBody ClosedList9088 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedList9088";
    }
}
