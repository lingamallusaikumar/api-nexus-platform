package com.apinexus.registry.massive.globalworker6120;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globalworker6120")
public class GlobalWorker6120Controller {
    private final GlobalWorker6120Service service;
    
    public GlobalWorker6120Controller(GlobalWorker6120Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalWorker6120> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalWorker6120 create(@RequestBody GlobalWorker6120 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalWorker6120";
    }
}
