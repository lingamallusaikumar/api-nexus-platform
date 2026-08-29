package com.apinexus.registry.massive.closedmap8099;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/closedmap8099")
public class ClosedMap8099Controller {
    private final ClosedMap8099Service service;
    
    public ClosedMap8099Controller(ClosedMap8099Service service) { this.service = service; }
    
    @GetMapping
    public List<ClosedMap8099> getAll() { return service.findAll(); }
    
    @PostMapping
    public ClosedMap8099 create(@RequestBody ClosedMap8099 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ClosedMap8099";
    }
}
