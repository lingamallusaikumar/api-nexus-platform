package com.apinexus.registry.massive.centralcontroller7131;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralcontroller7131")
public class CentralController7131Controller {
    private final CentralController7131Service service;
    
    public CentralController7131Controller(CentralController7131Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralController7131> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralController7131 create(@RequestBody CentralController7131 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralController7131";
    }
}
