package br.com.picpaychallenger.picpaychallenger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.picpaychallenger.picpaychallenger.domain.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(Long id);

}
