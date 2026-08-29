package com.apinexus.registry.massive.onlinecache1558;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinecache1558")
public class OnlineCache1558Controller {
    private final OnlineCache1558Service service;
    
    public OnlineCache1558Controller(OnlineCache1558Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineCache1558> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineCache1558 create(@RequestBody OnlineCache1558 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineCache1558";
    }
}
