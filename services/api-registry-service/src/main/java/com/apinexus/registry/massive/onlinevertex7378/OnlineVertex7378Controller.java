package com.apinexus.registry.massive.onlinevertex7378;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinevertex7378")
public class OnlineVertex7378Controller {
    private final OnlineVertex7378Service service;
    
    public OnlineVertex7378Controller(OnlineVertex7378Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineVertex7378> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineVertex7378 create(@RequestBody OnlineVertex7378 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineVertex7378";
    }
}
