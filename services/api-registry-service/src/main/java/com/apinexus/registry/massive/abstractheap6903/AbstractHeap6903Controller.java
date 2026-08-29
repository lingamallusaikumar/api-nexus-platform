package com.apinexus.registry.massive.abstractheap6903;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractheap6903")
public class AbstractHeap6903Controller {
    private final AbstractHeap6903Service service;
    
    public AbstractHeap6903Controller(AbstractHeap6903Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractHeap6903> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractHeap6903 create(@RequestBody AbstractHeap6903 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractHeap6903";
    }
}
