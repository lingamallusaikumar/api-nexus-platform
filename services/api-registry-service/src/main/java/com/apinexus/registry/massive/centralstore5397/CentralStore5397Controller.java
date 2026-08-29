package com.apinexus.registry.massive.centralstore5397;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralstore5397")
public class CentralStore5397Controller {
    private final CentralStore5397Service service;
    
    public CentralStore5397Controller(CentralStore5397Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralStore5397> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralStore5397 create(@RequestBody CentralStore5397 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralStore5397";
    }
}
