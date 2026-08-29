package com.apinexus.registry.massive.topicrecord3987;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TopicRecord3987Service {
    private final TopicRecord3987Repository repository;
    
    public TopicRecord3987Service(TopicRecord3987Repository repository) { this.repository = repository; }
    
    public List<TopicRecord3987> findAll() { return repository.findAll(); }
    public TopicRecord3987 save(TopicRecord3987 entity) { return repository.save(entity); }
    public Optional<TopicRecord3987> findById(Long id) { return repository.findById(id); }
    public void deleteById(Long id) { repository.deleteById(id); }
    
    public void executeCustomLogic() {
        System.out.println("Executing unique logic for TopicRecord3987");
    }
}
