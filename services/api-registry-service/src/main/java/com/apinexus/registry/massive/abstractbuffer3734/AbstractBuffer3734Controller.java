package com.apinexus.registry.massive.abstractbuffer3734;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/abstractbuffer3734")
public class AbstractBuffer3734Controller {
    private final AbstractBuffer3734Service service;
    
    public AbstractBuffer3734Controller(AbstractBuffer3734Service service) { this.service = service; }
    
    @GetMapping
    public List<AbstractBuffer3734> getAll() { return service.findAll(); }
    
    @PostMapping
    public AbstractBuffer3734 create(@RequestBody AbstractBuffer3734 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed AbstractBuffer3734";
    }
}
