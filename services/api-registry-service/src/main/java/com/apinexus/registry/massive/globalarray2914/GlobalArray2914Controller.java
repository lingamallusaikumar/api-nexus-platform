package com.apinexus.registry.massive.globalarray2914;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalarray2914")
public class GlobalArray2914Controller {
    private final GlobalArray2914Service service;
    
    public GlobalArray2914Controller(GlobalArray2914Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalArray2914> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalArray2914 create(@RequestBody GlobalArray2914 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalArray2914";
    }
}
