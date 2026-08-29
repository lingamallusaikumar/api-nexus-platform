package com.apinexus.registry.massive.neuralportal6766;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralportal6766")
public class NeuralPortal6766Controller {
    private final NeuralPortal6766Service service;
    
    public NeuralPortal6766Controller(NeuralPortal6766Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralPortal6766> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralPortal6766 create(@RequestBody NeuralPortal6766 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralPortal6766";
    }
}
