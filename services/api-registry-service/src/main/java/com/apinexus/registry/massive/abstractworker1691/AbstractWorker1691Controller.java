package com.apinexus.registry.massive.abstractworker1691;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractworker1691")
public class AbstractWorker1691Controller {
    private final AbstractWorker1691Service service;
    
    public AbstractWorker1691Controller(AbstractWorker1691Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractWorker1691> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractWorker1691 create(@RequestBody AbstractWorker1691 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractWorker1691";
    }
}
