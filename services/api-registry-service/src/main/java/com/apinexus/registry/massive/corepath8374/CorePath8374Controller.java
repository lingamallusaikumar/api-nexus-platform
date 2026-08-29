package com.apinexus.registry.massive.corepath8374;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/corepath8374")
public class CorePath8374Controller {
    private final CorePath8374Service service;
    
    public CorePath8374Controller(CorePath8374Service service) { this.service = service; }
    
    @GetMapping
    public List<CorePath8374> getAll() { return service.findAll(); }
    
    @PostMapping
    public CorePath8374 create(@RequestBody CorePath8374 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CorePath8374";
    }
}
