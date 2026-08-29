package com.apinexus.registry.massive.chainsystem8815;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainsystem8815")
public class ChainSystem8815Controller {
    private final ChainSystem8815Service service;
    
    public ChainSystem8815Controller(ChainSystem8815Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainSystem8815> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainSystem8815 create(@RequestBody ChainSystem8815 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainSystem8815";
    }
}
