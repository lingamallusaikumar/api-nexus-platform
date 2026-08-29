package com.apinexus.registry.massive.dynamicengine8900;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicengine8900")
public class DynamicEngine8900Controller {
    private final DynamicEngine8900Service service;
    
    public DynamicEngine8900Controller(DynamicEngine8900Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicEngine8900> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicEngine8900 create(@RequestBody DynamicEngine8900 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicEngine8900";
    }
}
