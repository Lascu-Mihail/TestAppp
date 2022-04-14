package TestApp.example.TestApp.Service;

import TestApp.example.TestApp.Config.token.ConfirmationToken;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class ConfirmationService {

    private final UserService userService;
    private final ConfirmationTokenService confirmationTokenService;

    @Transactional
    public String confirmToken(String token){
        ConfirmationToken confirmationToken = confirmationTokenService
                .getToken(token).orElseThrow(()->new IllegalStateException("token not found"));

        if(confirmationToken.getConfirmedAt() !=null){
            throw new IllegalStateException("email already confirmed");
        }
        LocalDateTime expiresAt =confirmationToken.getExpiresAt();

        if(expiresAt.isBefore(LocalDateTime.now())){
            throw new IllegalStateException("token expired");
        }
        confirmationTokenService.setConfirmedAt(token);
            userService.enableUser(confirmationToken.getUser().getEmail());
            return "confimed";
        }
    }

