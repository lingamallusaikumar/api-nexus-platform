package com.apinexus.registry.massive.centraldatabase8435;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/centraldatabase8435")
public class CentralDatabase8435Controller {
    private final CentralDatabase8435Service service;
    
    public CentralDatabase8435Controller(CentralDatabase8435Service service) { this.service = service; }
    
    @GetMapping
    public List<CentralDatabase8435> getAll() { return service.findAll(); }
    
    @PostMapping
    public CentralDatabase8435 create(@RequestBody CentralDatabase8435 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CentralDatabase8435";
    }
}
