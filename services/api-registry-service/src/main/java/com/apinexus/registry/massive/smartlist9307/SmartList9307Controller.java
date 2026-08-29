package com.apinexus.registry.massive.smartlist9307;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/smartlist9307")
public class SmartList9307Controller {
    private final SmartList9307Service service;
    
    public SmartList9307Controller(SmartList9307Service service) { this.service = service; }
    
    @GetMapping
    public List<SmartList9307> getAll() { return service.findAll(); }
    
    @PostMapping
    public SmartList9307 create(@RequestBody SmartList9307 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed SmartList9307";
    }
}
