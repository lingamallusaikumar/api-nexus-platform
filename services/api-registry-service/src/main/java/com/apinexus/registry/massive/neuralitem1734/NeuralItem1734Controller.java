package com.apinexus.registry.massive.neuralitem1734;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralitem1734")
public class NeuralItem1734Controller {
    private final NeuralItem1734Service service;
    
    public NeuralItem1734Controller(NeuralItem1734Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralItem1734> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralItem1734 create(@RequestBody NeuralItem1734 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralItem1734";
    }
}
