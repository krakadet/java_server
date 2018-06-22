package companies.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CompaniesRepository extends CrudRepository<Company, Long> {

}