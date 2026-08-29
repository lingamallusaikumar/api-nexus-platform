package com.apinexus.registry.massive.closedhandler4892;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedhandler4892")
public class ClosedHandler4892Controller {
    private final ClosedHandler4892Service service;
    
    public ClosedHandler4892Controller(ClosedHandler4892Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedHandler4892> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedHandler4892 create(@RequestBody ClosedHandler4892 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedHandler4892";
    }
}
