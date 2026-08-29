package com.apinexus.registry.massive.globalengine3188;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalengine3188")
public class GlobalEngine3188Controller {
    private final GlobalEngine3188Service service;
    
    public GlobalEngine3188Controller(GlobalEngine3188Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalEngine3188> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalEngine3188 create(@RequestBody GlobalEngine3188 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalEngine3188";
    }
}
