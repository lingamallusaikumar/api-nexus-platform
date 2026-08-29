package com.apinexus.registry.massive.corestack2102;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/corestack2102")
public class CoreStack2102Controller {
    private final CoreStack2102Service service;
    
    public CoreStack2102Controller(CoreStack2102Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreStack2102> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreStack2102 create(@RequestBody CoreStack2102 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreStack2102";
    }
}
