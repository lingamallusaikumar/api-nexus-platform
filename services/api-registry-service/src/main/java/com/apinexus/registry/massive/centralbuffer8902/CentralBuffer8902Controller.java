package com.apinexus.registry.massive.centralbuffer8902;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centralbuffer8902")
public class CentralBuffer8902Controller {
    private final CentralBuffer8902Service service;
    
    public CentralBuffer8902Controller(CentralBuffer8902Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralBuffer8902> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralBuffer8902 create(@RequestBody CentralBuffer8902 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralBuffer8902";
    }
}
