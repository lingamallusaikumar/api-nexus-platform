package com.apinexus.registry.massive.asyncsystem8455;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncsystem8455")
public class AsyncSystem8455Controller {
    private final AsyncSystem8455Service service;
    
    public AsyncSystem8455Controller(AsyncSystem8455Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncSystem8455> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncSystem8455 create(@RequestBody AsyncSystem8455 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncSystem8455";
    }
}
