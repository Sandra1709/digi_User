package Services;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import entity.UserCredentialEntity;

public class CustomUserDetails implements UserDetails
{
	 private String name;
	    private String password;
	    public CustomUserDetails(UserCredentialEntity user) {
	        this.name = user.getName();
	        this.password = user.getPassword();
	    }
	    @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        return null;
	    }

	    @Override
	    public String getPassword() {
	        return password;
	    }

	    @Override
	    public String getUsername() {
	        return name;
	    }
		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}
		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}
		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}
		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return true;
		}
}
