package com.apinexus.registry.massive.chainengine3854;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainengine3854")
public class ChainEngine3854Controller {
    private final ChainEngine3854Service service;
    
    public ChainEngine3854Controller(ChainEngine3854Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainEngine3854> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainEngine3854 create(@RequestBody ChainEngine3854 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainEngine3854";
    }
}
