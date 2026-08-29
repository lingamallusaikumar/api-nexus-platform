package com.apinexus.registry.massive.neuralitem6957;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralitem6957")
public class NeuralItem6957Controller {
    private final NeuralItem6957Service service;
    
    public NeuralItem6957Controller(NeuralItem6957Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralItem6957> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralItem6957 create(@RequestBody NeuralItem6957 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralItem6957";
    }
}
