package com.apinexus.registry.massive.abstractflow4516;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractflow4516")
public class AbstractFlow4516Controller {
    private final AbstractFlow4516Service service;
    
    public AbstractFlow4516Controller(AbstractFlow4516Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractFlow4516> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractFlow4516 create(@RequestBody AbstractFlow4516 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractFlow4516";
    }
}
