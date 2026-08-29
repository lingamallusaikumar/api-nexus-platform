package com.apinexus.registry.massive.onlinequeue6496;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinequeue6496")
public class OnlineQueue6496Controller {
    private final OnlineQueue6496Service service;
    
    public OnlineQueue6496Controller(OnlineQueue6496Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineQueue6496> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineQueue6496 create(@RequestBody OnlineQueue6496 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineQueue6496";
    }
}
