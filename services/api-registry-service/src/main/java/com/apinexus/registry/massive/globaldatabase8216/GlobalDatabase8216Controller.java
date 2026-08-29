package com.apinexus.registry.massive.globaldatabase8216;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/globaldatabase8216")
public class GlobalDatabase8216Controller {
    private final GlobalDatabase8216Service service;
    
    public GlobalDatabase8216Controller(GlobalDatabase8216Service service) { this.service = service; }
    
    @GetMapping
    public List<GlobalDatabase8216> getAll() { return service.findAll(); }
    
    @PostMapping
    public GlobalDatabase8216 create(@RequestBody GlobalDatabase8216 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed GlobalDatabase8216";
    }
}
