package com.apinexus.registry.massive.asyncpath1715;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncpath1715")
public class AsyncPath1715Controller {
    private final AsyncPath1715Service service;
    
    public AsyncPath1715Controller(AsyncPath1715Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncPath1715> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncPath1715 create(@RequestBody AsyncPath1715 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncPath1715";
    }
}
