package com.apinexus.registry.massive.edgecache6309;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/edgecache6309")
public class EdgeCache6309Controller {
    private final EdgeCache6309Service service;
    
    public EdgeCache6309Controller(EdgeCache6309Service service) { this.service = service; }
    
    @GetMapping
    public List<EdgeCache6309> getAll() { return service.findAll(); }
    
    @PostMapping
    public EdgeCache6309 create(@RequestBody EdgeCache6309 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed EdgeCache6309";
    }
}
