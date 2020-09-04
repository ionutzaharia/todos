package top.passports.todos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.passports.todos.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
