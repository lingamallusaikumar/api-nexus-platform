package com.apinexus.registry.massive.localset5161;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localset5161")
public class LocalSet5161Controller {
    private final LocalSet5161Service service;
    
    public LocalSet5161Controller(LocalSet5161Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalSet5161> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalSet5161 create(@RequestBody LocalSet5161 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalSet5161";
    }
}
