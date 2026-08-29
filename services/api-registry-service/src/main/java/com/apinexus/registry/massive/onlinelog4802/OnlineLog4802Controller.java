package com.apinexus.registry.massive.onlinelog4802;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinelog4802")
public class OnlineLog4802Controller {
    private final OnlineLog4802Service service;
    
    public OnlineLog4802Controller(OnlineLog4802Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineLog4802> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineLog4802 create(@RequestBody OnlineLog4802 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineLog4802";
    }
}
