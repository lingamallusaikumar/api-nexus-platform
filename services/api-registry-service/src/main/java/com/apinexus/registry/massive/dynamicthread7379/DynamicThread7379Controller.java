package com.apinexus.registry.massive.dynamicthread7379;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/dynamicthread7379")
public class DynamicThread7379Controller {
    private final DynamicThread7379Service service;
    
    public DynamicThread7379Controller(DynamicThread7379Service service) { this.service = service; }
    
    @GetMapping
    public List<DynamicThread7379> getAll() { return service.findAll(); }
    
    @PostMapping
    public DynamicThread7379 create(@RequestBody DynamicThread7379 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed DynamicThread7379";
    }
}
