package groupe3.crm.repository;

import groupe3.crm.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Sebastien Bissay
 */
public interface ClientRepository extends JpaRepository<Client, Long>{
}
