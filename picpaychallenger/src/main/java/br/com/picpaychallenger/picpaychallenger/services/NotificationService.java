package br.com.picpaychallenger.picpaychallenger.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.picpaychallenger.picpaychallenger.domain.user.User;
import br.com.picpaychallenger.picpaychallenger.dtos.NotificationDTO;

@Service
public class NotificationService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email, message);

        ResponseEntity <String> notificationResponse = restTemplate.postForEntity("https://run.mocky.io/v3/5794d450-d2e2-4412-8131-73d0293ac1cc", notificationRequest, String.class);

        if (!(notificationResponse.getStatusCode() == HttpStatus.OK)){
            System.out.println("Erro ao enviar notificacao");
            throw new Exception("Serviço fora do ar.");
            
        }
    }
}
