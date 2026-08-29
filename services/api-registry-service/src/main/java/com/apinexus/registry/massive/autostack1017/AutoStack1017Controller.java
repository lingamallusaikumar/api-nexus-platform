package com.apinexus.registry.massive.autostack1017;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autostack1017")
public class AutoStack1017Controller {
    private final AutoStack1017Service service;
    
    public AutoStack1017Controller(AutoStack1017Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoStack1017> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoStack1017 create(@RequestBody AutoStack1017 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoStack1017";
    }
}
