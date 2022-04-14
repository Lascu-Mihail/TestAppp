package TestApp.example.TestApp.Service;

import TestApp.example.TestApp.Config.token.ConfirmationToken;
import TestApp.example.TestApp.Repository.ConfirmationTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final ConfirmationTokenRepository confirmationTokenRepository;

    public void saveConfirmationToken(ConfirmationToken token){
        confirmationTokenRepository.save(token);
    }

    public Optional<ConfirmationToken>getToken(String token){
        return confirmationTokenRepository.findByToken(token);

    }

    public int setConfirmedAt(String token){
        return confirmationTokenRepository.updateConfirmedAt(token, LocalDateTime.now());
    }
}