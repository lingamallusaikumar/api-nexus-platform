package com.apinexus.registry.massive.chaingraph4748;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chaingraph4748")
public class ChainGraph4748Controller {
    private final ChainGraph4748Service service;
    
    public ChainGraph4748Controller(ChainGraph4748Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainGraph4748> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainGraph4748 create(@RequestBody ChainGraph4748 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainGraph4748";
    }
}
