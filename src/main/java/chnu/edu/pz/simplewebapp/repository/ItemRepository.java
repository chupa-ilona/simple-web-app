package chnu.edu.pz.simplewebapp.repository;


import chnu.edu.pz.simplewebapp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}