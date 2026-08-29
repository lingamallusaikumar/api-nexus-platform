package com.apinexus.registry.massive.centralsystem3416;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralsystem3416")
public class CentralSystem3416Controller {
    private final CentralSystem3416Service service;
    
    public CentralSystem3416Controller(CentralSystem3416Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralSystem3416> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralSystem3416 create(@RequestBody CentralSystem3416 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralSystem3416";
    }
}
