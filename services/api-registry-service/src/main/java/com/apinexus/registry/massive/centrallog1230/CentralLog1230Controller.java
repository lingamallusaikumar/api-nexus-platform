package com.apinexus.registry.massive.centrallog1230;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centrallog1230")
public class CentralLog1230Controller {
    private final CentralLog1230Service service;
    
    public CentralLog1230Controller(CentralLog1230Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralLog1230> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralLog1230 create(@RequestBody CentralLog1230 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralLog1230";
    }
}
