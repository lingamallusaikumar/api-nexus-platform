package com.apinexus.registry.massive.localcomponent8575;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localcomponent8575")
public class LocalComponent8575Controller {
    private final LocalComponent8575Service service;
    
    public LocalComponent8575Controller(LocalComponent8575Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalComponent8575> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalComponent8575 create(@RequestBody LocalComponent8575 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalComponent8575";
    }
}
