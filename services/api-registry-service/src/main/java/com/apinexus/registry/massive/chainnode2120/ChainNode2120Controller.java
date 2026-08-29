package com.apinexus.registry.massive.chainnode2120;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainnode2120")
public class ChainNode2120Controller {
    private final ChainNode2120Service service;
    
    public ChainNode2120Controller(ChainNode2120Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainNode2120> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainNode2120 create(@RequestBody ChainNode2120 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainNode2120";
    }
}
