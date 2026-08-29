package com.apinexus.registry.massive.onlinetree9409;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/onlinetree9409")
public class OnlineTree9409Controller {
    private final OnlineTree9409Service service;
    
    public OnlineTree9409Controller(OnlineTree9409Service service) { this.service = service; }
    
    @GetMapping
    public List<OnlineTree9409> getAll() { return service.findAll(); }
    
    @PostMapping
    public OnlineTree9409 create(@RequestBody OnlineTree9409 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed OnlineTree9409";
    }
}
