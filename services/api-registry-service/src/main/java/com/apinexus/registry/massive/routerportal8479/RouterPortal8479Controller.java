package com.apinexus.registry.massive.routerportal8479;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/routerportal8479")
public class RouterPortal8479Controller {
    private final RouterPortal8479Service service;
    
    public RouterPortal8479Controller(RouterPortal8479Service service) { this.service = service; }
    
    @GetMapping
    public List<RouterPortal8479> getAll() { return service.findAll(); }
    
    @PostMapping
    public RouterPortal8479 create(@RequestBody RouterPortal8479 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed RouterPortal8479";
    }
}
