package com.apinexus.registry.massive.abstractnode1612;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractnode1612")
public class AbstractNode1612Controller {
    private final AbstractNode1612Service service;
    
    public AbstractNode1612Controller(AbstractNode1612Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractNode1612> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractNode1612 create(@RequestBody AbstractNode1612 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractNode1612";
    }
}
