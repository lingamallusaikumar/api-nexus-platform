package com.apinexus.registry.massive.asyncmap3689;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncmap3689")
public class AsyncMap3689Controller {
    private final AsyncMap3689Service service;
    
    public AsyncMap3689Controller(AsyncMap3689Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncMap3689> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncMap3689 create(@RequestBody AsyncMap3689 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncMap3689";
    }
}
