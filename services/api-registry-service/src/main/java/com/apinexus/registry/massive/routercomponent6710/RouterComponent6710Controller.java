package com.apinexus.registry.massive.routercomponent6710;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routercomponent6710")
public class RouterComponent6710Controller {
    private final RouterComponent6710Service service;
    
    public RouterComponent6710Controller(RouterComponent6710Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterComponent6710> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterComponent6710 create(@RequestBody RouterComponent6710 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterComponent6710";
    }
}
