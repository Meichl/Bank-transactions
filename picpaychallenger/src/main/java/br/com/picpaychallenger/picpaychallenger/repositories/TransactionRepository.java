package br.com.picpaychallenger.picpaychallenger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.picpaychallenger.picpaychallenger.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
