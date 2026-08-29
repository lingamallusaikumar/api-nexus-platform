package com.apinexus.registry.massive.chainqueue5678;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainqueue5678")
public class ChainQueue5678Controller {
    private final ChainQueue5678Service service;
    
    public ChainQueue5678Controller(ChainQueue5678Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainQueue5678> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainQueue5678 create(@RequestBody ChainQueue5678 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainQueue5678";
    }
}
