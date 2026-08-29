package com.apinexus.registry.massive.dynamicprocessor7840;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicprocessor7840")
public class DynamicProcessor7840Controller {
    private final DynamicProcessor7840Service service;
    
    public DynamicProcessor7840Controller(DynamicProcessor7840Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicProcessor7840> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicProcessor7840 create(@RequestBody DynamicProcessor7840 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicProcessor7840";
    }
}
