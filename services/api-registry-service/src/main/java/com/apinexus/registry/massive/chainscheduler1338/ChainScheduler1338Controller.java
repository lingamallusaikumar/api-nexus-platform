package com.apinexus.registry.massive.chainscheduler1338;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainscheduler1338")
public class ChainScheduler1338Controller {
    private final ChainScheduler1338Service service;
    
    public ChainScheduler1338Controller(ChainScheduler1338Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainScheduler1338> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainScheduler1338 create(@RequestBody ChainScheduler1338 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainScheduler1338";
    }
}
