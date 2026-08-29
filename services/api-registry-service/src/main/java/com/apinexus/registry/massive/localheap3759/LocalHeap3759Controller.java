package com.apinexus.registry.massive.localheap3759;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localheap3759")
public class LocalHeap3759Controller {
    private final LocalHeap3759Service service;
    
    public LocalHeap3759Controller(LocalHeap3759Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalHeap3759> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalHeap3759 create(@RequestBody LocalHeap3759 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalHeap3759";
    }
}
