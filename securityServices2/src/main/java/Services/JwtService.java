package Services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.io.Decoders;
////import io.jsonwebtoken.security.Keys;
//import org.springframework.stereotype.Service;

//import java.security.Key;
//import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtService {
	
	
	public static final String SECRET = "5367566B59703373367639792F423F4528482B4D6251655468576D5A71347437";
    public void validateToken(String token) {
        Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
    }
    public String generateToken(String userName){
        Map<String,Object> claims=new HashMap<>();
        return createToken(claims,userName);
    }
//    @SuppressWarnings("deprecation")
	@SuppressWarnings("deprecation")
	private String createToken(Map<String, Object> claims, String userName) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(userName)
//                .setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
                .signWith(SignatureAlgorithm.HS256,SECRET).compact();
    }
//    private Key getSignKey() {
//        byte[] keyBytes= Decoders.BASE64.decode(SECRET);
//        return (Key) Keys.hmacShaKeyFor(keyBytes);
//    }

}
