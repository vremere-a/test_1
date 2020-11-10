package test_1.demo.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import test_1.demo.model.Root;
import test_1.demo.repository.RootRepository;

@Service
public class RootServiceImpl implements NodeService<Root>{
    private final RootRepository nodeRepository;

    public RootServiceImpl(RootRepository nodeRepository) {
        this.nodeRepository = nodeRepository;
    }

    @Override
    public Mono<Root> add(Root node) {
        return nodeRepository.save(node);
    }

    @Override
    public Flux<Root> getAll() {
        return nodeRepository.findAll();
    }
}
