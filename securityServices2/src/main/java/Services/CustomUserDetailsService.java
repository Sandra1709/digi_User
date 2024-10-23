package Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import entity.UserCredentialEntity;
import entity.UserCredentialRepo;

public class CustomUserDetailsService implements UserDetailsService {


    @Autowired
    UserCredentialRepo userCredentialRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserCredentialEntity> user = userCredentialRepo.findByName(username);
        System.out.println("user 2: " + user);
        return user.map(CustomUserDetails::new).orElseThrow(()->new UsernameNotFoundException("Username/password not valid!"));
    }
	
}
