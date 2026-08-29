package com.apinexus.registry.massive.onlineflow7157;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlineflow7157")
public class OnlineFlow7157Controller {
    private final OnlineFlow7157Service service;
    
    public OnlineFlow7157Controller(OnlineFlow7157Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineFlow7157> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineFlow7157 create(@RequestBody OnlineFlow7157 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineFlow7157";
    }
}
