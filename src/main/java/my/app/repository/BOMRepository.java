package my.app.repository;

import my.app.entities.BoardOfManagers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BOMRepository extends JpaRepository<BoardOfManagers, Long> {

}
