package com.apinexus.registry.massive.routerprocess4608;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerprocess4608")
public class RouterProcess4608Controller {
    private final RouterProcess4608Service service;
    
    public RouterProcess4608Controller(RouterProcess4608Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterProcess4608> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterProcess4608 create(@RequestBody RouterProcess4608 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterProcess4608";
    }
}
