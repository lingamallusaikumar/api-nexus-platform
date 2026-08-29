package com.apinexus.registry.massive.localset2663;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localset2663")
public class LocalSet2663Controller {
    private final LocalSet2663Service service;
    
    public LocalSet2663Controller(LocalSet2663Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalSet2663> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalSet2663 create(@RequestBody LocalSet2663 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalSet2663";
    }
}
