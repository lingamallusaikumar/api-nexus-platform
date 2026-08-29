package com.apinexus.registry.massive.globalpool2908;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalpool2908")
public class GlobalPool2908Controller {
    private final GlobalPool2908Service service;
    
    public GlobalPool2908Controller(GlobalPool2908Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalPool2908> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalPool2908 create(@RequestBody GlobalPool2908 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalPool2908";
    }
}
