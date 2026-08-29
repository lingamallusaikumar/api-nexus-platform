package com.apinexus.registry.massive.routerpool2979;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerpool2979")
public class RouterPool2979Controller {
    private final RouterPool2979Service service;
    
    public RouterPool2979Controller(RouterPool2979Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterPool2979> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterPool2979 create(@RequestBody RouterPool2979 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterPool2979";
    }
}
