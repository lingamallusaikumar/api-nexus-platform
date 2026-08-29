package com.apinexus.registry.massive.onlinelink4838;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinelink4838")
public class OnlineLink4838Controller {
    private final OnlineLink4838Service service;
    
    public OnlineLink4838Controller(OnlineLink4838Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineLink4838> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineLink4838 create(@RequestBody OnlineLink4838 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineLink4838";
    }
}
