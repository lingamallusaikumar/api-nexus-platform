package com.apinexus.registry.massive.chainnode8496;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/chainnode8496")
public class ChainNode8496Controller {
    private final ChainNode8496Service service;
    
    public ChainNode8496Controller(ChainNode8496Service service) { this.service = service; }
    
    @GetMapping
    public List<ChainNode8496> getAll() { return service.findAll(); }
    
    @PostMapping
    public ChainNode8496 create(@RequestBody ChainNode8496 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed ChainNode8496";
    }
}
