package com.apinexus.registry.massive.routerroute8767;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerroute8767")
public class RouterRoute8767Controller {
    private final RouterRoute8767Service service;
    
    public RouterRoute8767Controller(RouterRoute8767Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterRoute8767> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterRoute8767 create(@RequestBody RouterRoute8767 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterRoute8767";
    }
}
