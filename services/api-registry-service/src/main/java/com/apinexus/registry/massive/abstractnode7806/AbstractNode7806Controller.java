package com.apinexus.registry.massive.abstractnode7806;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractnode7806")
public class AbstractNode7806Controller {
    private final AbstractNode7806Service service;
    
    public AbstractNode7806Controller(AbstractNode7806Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractNode7806> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractNode7806 create(@RequestBody AbstractNode7806 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractNode7806";
    }
}
