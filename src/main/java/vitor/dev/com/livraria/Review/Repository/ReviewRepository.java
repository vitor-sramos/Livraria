package vitor.dev.com.livraria.Review.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vitor.dev.com.livraria.Review.Model.Review;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {
}
