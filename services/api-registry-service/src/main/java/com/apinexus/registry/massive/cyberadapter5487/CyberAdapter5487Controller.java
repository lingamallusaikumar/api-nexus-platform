package com.apinexus.registry.massive.cyberadapter5487;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberadapter5487")
public class CyberAdapter5487Controller {
    private final CyberAdapter5487Service service;
    
    public CyberAdapter5487Controller(CyberAdapter5487Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberAdapter5487> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberAdapter5487 create(@RequestBody CyberAdapter5487 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberAdapter5487";
    }
}
