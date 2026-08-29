package com.apinexus.registry.massive.cyberdispatcher4581;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/cyberdispatcher4581")
public class CyberDispatcher4581Controller {
    private final CyberDispatcher4581Service service;
    
    public CyberDispatcher4581Controller(CyberDispatcher4581Service service) { this.service = service; }
    
    @GetMapping
    public List<CyberDispatcher4581> getAll() { return service.findAll(); }
    
    @PostMapping
    public CyberDispatcher4581 create(@RequestBody CyberDispatcher4581 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed CyberDispatcher4581";
    }
}
