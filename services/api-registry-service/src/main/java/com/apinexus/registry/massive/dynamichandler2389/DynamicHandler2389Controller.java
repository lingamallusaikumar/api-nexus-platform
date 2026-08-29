package com.apinexus.registry.massive.dynamichandler2389;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamichandler2389")
public class DynamicHandler2389Controller {
    private final DynamicHandler2389Service service;
    
    public DynamicHandler2389Controller(DynamicHandler2389Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicHandler2389> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicHandler2389 create(@RequestBody DynamicHandler2389 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicHandler2389";
    }
}
