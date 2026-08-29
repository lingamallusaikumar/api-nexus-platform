package com.apinexus.registry.massive.centralmap6340;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralmap6340")
public class CentralMap6340Controller {
    private final CentralMap6340Service service;
    
    public CentralMap6340Controller(CentralMap6340Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralMap6340> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralMap6340 create(@RequestBody CentralMap6340 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralMap6340";
    }
}
