package com.apinexus.registry.massive.globallist4863;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globallist4863")
public class GlobalList4863Controller {
    private final GlobalList4863Service service;
    
    public GlobalList4863Controller(GlobalList4863Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalList4863> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalList4863 create(@RequestBody GlobalList4863 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalList4863";
    }
}
