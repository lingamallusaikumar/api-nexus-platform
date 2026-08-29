package com.apinexus.registry.massive.chainlist8983;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainlist8983")
public class ChainList8983Controller {
    private final ChainList8983Service service;
    
    public ChainList8983Controller(ChainList8983Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainList8983> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainList8983 create(@RequestBody ChainList8983 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainList8983";
    }
}
