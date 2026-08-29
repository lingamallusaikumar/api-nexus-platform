package com.apinexus.registry.massive.localmodule3228;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/localmodule3228")
public class LocalModule3228Controller {
    private final LocalModule3228Service service;
    
    public LocalModule3228Controller(LocalModule3228Service service) { this.service = service; }
    
    @GetMapping
    public List<LocalModule3228> getAll() { return service.findAll(); }
    
    @PostMapping
    public LocalModule3228 create(@RequestBody LocalModule3228 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed LocalModule3228";
    }
}
