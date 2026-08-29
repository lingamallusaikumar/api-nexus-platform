package com.apinexus.registry.massive.asyncpath1215;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/asyncpath1215")
public class AsyncPath1215Controller {
    private final AsyncPath1215Service service;
    
    public AsyncPath1215Controller(AsyncPath1215Service service) { this.service = service; }
    
    @GetMapping
    public List<AsyncPath1215> getAll() { return service.findAll(); }
    
    @PostMapping
    public AsyncPath1215 create(@RequestBody AsyncPath1215 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AsyncPath1215";
    }
}
