package com.apinexus.registry.massive.smartinterface4207;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartinterface4207")
public class SmartInterface4207Controller {
    private final SmartInterface4207Service service;
    
    public SmartInterface4207Controller(SmartInterface4207Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartInterface4207> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartInterface4207 create(@RequestBody SmartInterface4207 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartInterface4207";
    }
}
