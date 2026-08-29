package com.apinexus.registry.massive.neuralnode6836;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralnode6836")
public class NeuralNode6836Controller {
    private final NeuralNode6836Service service;
    
    public NeuralNode6836Controller(NeuralNode6836Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralNode6836> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralNode6836 create(@RequestBody NeuralNode6836 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralNode6836";
    }
}
