package com.apinexus.registry.massive.physicalgateway5144;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/physicalgateway5144")
public class PhysicalGateway5144Controller {
    private final PhysicalGateway5144Service service;
    
    public PhysicalGateway5144Controller(PhysicalGateway5144Service service) { this.service = service; }
    
    @GetMapping
    public List<PhysicalGateway5144> getAll() { return service.findAll(); }
    
    @PostMapping
    public PhysicalGateway5144 create(@RequestBody PhysicalGateway5144 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed PhysicalGateway5144";
    }
}
