package com.apinexus.registry.massive.abstractbroker1494;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractbroker1494")
public class AbstractBroker1494Controller {
    private final AbstractBroker1494Service service;
    
    public AbstractBroker1494Controller(AbstractBroker1494Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractBroker1494> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractBroker1494 create(@RequestBody AbstractBroker1494 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractBroker1494";
    }
}
