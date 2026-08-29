package com.apinexus.registry.massive.proxylink7551;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProxyLink7551Service {
    private final ProxyLink7551Repository repository;
    
    public ProxyLink7551Service(ProxyLink7551Repository repository) { this.repository = repository; }
    
    public List<ProxyLink7551> findAll() { return repository.findAll(); }
    public ProxyLink7551 save(ProxyLink7551 entity) { return repository.save(entity); }
    public Optional<ProxyLink7551> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for ProxyLink7551");
    }
}
