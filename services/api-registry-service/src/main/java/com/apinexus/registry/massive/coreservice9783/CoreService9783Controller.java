package com.apinexus.registry.massive.coreservice9783;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/coreservice9783")
public class CoreService9783Controller {
    private final CoreService9783Service service;
    
    public CoreService9783Controller(CoreService9783Service service) { this.service = service; }
    
    @GetMapping
    public List<CoreService9783> getAll() { return service.findAll(); }
    
    @PostMapping
    public CoreService9783 create(@RequestBody CoreService9783 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CoreService9783";
    }
}
