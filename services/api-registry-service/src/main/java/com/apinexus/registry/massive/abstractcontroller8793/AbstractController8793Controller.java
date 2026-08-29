package com.apinexus.registry.massive.abstractcontroller8793;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractcontroller8793")
public class AbstractController8793Controller {
    private final AbstractController8793Service service;
    
    public AbstractController8793Controller(AbstractController8793Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractController8793> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractController8793 create(@RequestBody AbstractController8793 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractController8793";
    }
}
