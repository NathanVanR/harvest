package za.co.harvest.repository;

import com.google.cloud.firestore.Firestore;
import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import org.springframework.stereotype.Repository;
import za.co.harvest.entity.Product;

@Repository
public interface ProductRepository extends FirestoreReactiveRepository<Product> {
}
