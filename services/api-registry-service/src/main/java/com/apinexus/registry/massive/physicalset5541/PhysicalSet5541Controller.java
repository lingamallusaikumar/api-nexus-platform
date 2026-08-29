package com.apinexus.registry.massive.physicalset5541;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalset5541")
public class PhysicalSet5541Controller {
    private final PhysicalSet5541Service service;
    
    public PhysicalSet5541Controller(PhysicalSet5541Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalSet5541> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalSet5541 create(@RequestBody PhysicalSet5541 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalSet5541";
    }
}
