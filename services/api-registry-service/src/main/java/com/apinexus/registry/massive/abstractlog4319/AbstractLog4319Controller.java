package com.apinexus.registry.massive.abstractlog4319;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractlog4319")
public class AbstractLog4319Controller {
    private final AbstractLog4319Service service;
    
    public AbstractLog4319Controller(AbstractLog4319Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractLog4319> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractLog4319 create(@RequestBody AbstractLog4319 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractLog4319";
    }
}
