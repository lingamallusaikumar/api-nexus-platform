package com.apinexus.registry.massive.closedlist5670;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedlist5670")
public class ClosedList5670Controller {
    private final ClosedList5670Service service;
    
    public ClosedList5670Controller(ClosedList5670Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedList5670> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedList5670 create(@RequestBody ClosedList5670 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedList5670";
    }
}
