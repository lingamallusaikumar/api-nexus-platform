package com.apinexus.registry.massive.routerroute6032;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerroute6032")
public class RouterRoute6032Controller {
    private final RouterRoute6032Service service;
    
    public RouterRoute6032Controller(RouterRoute6032Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterRoute6032> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterRoute6032 create(@RequestBody RouterRoute6032 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterRoute6032";
    }
}
