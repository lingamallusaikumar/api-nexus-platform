package com.apinexus.registry.massive.neuralgateway6420;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/neuralgateway6420")
public class NeuralGateway6420Controller {
    private final NeuralGateway6420Service service;
    
    public NeuralGateway6420Controller(NeuralGateway6420Service service) { this.service = service; }
    
    @GetMapping
    public List<NeuralGateway6420> getAll() { return service.findAll(); }
    
    @PostMapping
    public NeuralGateway6420 create(@RequestBody NeuralGateway6420 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed NeuralGateway6420";
    }
}
