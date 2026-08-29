package com.apinexus.registry.massive.autonode115;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/autonode115")
public class AutoNode115Controller {
    private final AutoNode115Service service;
    
    public AutoNode115Controller(AutoNode115Service service) { this.service = service; }
    
    @GetMapping
    public List<AutoNode115> getAll() { return service.findAll(); }
    
    @PostMapping
    public AutoNode115 create(@RequestBody AutoNode115 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AutoNode115";
    }
}
