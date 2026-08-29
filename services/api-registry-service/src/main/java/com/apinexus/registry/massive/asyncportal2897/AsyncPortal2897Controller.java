package com.apinexus.registry.massive.asyncportal2897;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncportal2897")
public class AsyncPortal2897Controller {
    private final AsyncPortal2897Service service;
    
    public AsyncPortal2897Controller(AsyncPortal2897Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncPortal2897> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncPortal2897 create(@RequestBody AsyncPortal2897 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncPortal2897";
    }
}
