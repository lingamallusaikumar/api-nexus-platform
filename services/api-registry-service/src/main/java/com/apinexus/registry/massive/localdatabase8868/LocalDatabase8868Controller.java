package com.apinexus.registry.massive.localdatabase8868;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localdatabase8868")
public class LocalDatabase8868Controller {
    private final LocalDatabase8868Service service;
    
    public LocalDatabase8868Controller(LocalDatabase8868Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalDatabase8868> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalDatabase8868 create(@RequestBody LocalDatabase8868 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalDatabase8868";
    }
}
