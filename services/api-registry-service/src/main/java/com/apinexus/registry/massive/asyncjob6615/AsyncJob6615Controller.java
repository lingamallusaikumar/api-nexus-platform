package com.apinexus.registry.massive.asyncjob6615;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncjob6615")
public class AsyncJob6615Controller {
    private final AsyncJob6615Service service;
    
    public AsyncJob6615Controller(AsyncJob6615Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncJob6615> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncJob6615 create(@RequestBody AsyncJob6615 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncJob6615";
    }
}
