package test_1.demo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import test_1.demo.model.Desk;

public interface DeskRepository extends ReactiveMongoRepository<Desk, String> {
}