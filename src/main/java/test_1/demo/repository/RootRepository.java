package test_1.demo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import test_1.demo.model.Root;

public interface RootRepository extends ReactiveMongoRepository<Root, String> {
}