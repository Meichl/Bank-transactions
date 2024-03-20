package br.com.picpaychallenger.picpaychallenger.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.picpaychallenger.picpaychallenger.domain.user.User;
import br.com.picpaychallenger.picpaychallenger.dtos.TransactionDTO;
import br.com.picpaychallenger.picpaychallenger.repositories.TransactionRepository;

@Service
public class TransactionService {
    @Autowired
    private UserService userService;
    @Autowired
    private TransactionRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    public void createTransaction(TransactionDTO transaction) throws Exception{
        User sender = this.userService.findUserById(transaction.senderId());
        User receiver = this.userService.findUserById(transaction.receiverId());

        userService.validateTransaction(sender, transaction.value());


        if()
    }

    public Boolean authorizeTransaction(User sender, BigDecimal value){
        = restTemplate.getForEntity();
    }
}
