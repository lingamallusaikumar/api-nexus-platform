package com.apinexus.registry.massive.globalrecord173;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalrecord173")
public class GlobalRecord173Controller {
    private final GlobalRecord173Service service;
    
    public GlobalRecord173Controller(GlobalRecord173Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalRecord173> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalRecord173 create(@RequestBody GlobalRecord173 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalRecord173";
    }
}
