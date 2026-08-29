package com.apinexus.registry.massive.localagent4593;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localagent4593")
public class LocalAgent4593Controller {
    private final LocalAgent4593Service service;
    
    public LocalAgent4593Controller(LocalAgent4593Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalAgent4593> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalAgent4593 create(@RequestBody LocalAgent4593 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalAgent4593";
    }
}
