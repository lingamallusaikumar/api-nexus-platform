package com.apinexus.registry.massive.chainrecord7796;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainrecord7796")
public class ChainRecord7796Controller {
    private final ChainRecord7796Service service;
    
    public ChainRecord7796Controller(ChainRecord7796Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainRecord7796> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainRecord7796 create(@RequestBody ChainRecord7796 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainRecord7796";
    }
}
