package com.apinexus.registry.massive.dynamicinterface1468;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicinterface1468")
public class DynamicInterface1468Controller {
    private final DynamicInterface1468Service service;
    
    public DynamicInterface1468Controller(DynamicInterface1468Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicInterface1468> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicInterface1468 create(@RequestBody DynamicInterface1468 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicInterface1468";
    }
}
