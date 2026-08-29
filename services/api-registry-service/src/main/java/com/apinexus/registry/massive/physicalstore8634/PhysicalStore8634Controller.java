package com.apinexus.registry.massive.physicalstore8634;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalstore8634")
public class PhysicalStore8634Controller {
    private final PhysicalStore8634Service service;
    
    public PhysicalStore8634Controller(PhysicalStore8634Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalStore8634> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalStore8634 create(@RequestBody PhysicalStore8634 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalStore8634";
    }
}
