package com.ceiba.laboratorio.security;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class Authentication {
	
	private final String key = "teste";
	@SuppressWarnings("unused")
	private final int TIEMPO_MAX_SESSION=10;
	
	public String compactJws(String user) {
		String compactJws = Jwts.builder()
				.setSubject( user )
			//	.setExpiration(Date.from(Instant.now().plusSeconds(60 * TIEMPO_MAX_SESSION))) 
				.signWith(SignatureAlgorithm.HS512, key)
				.compact();

		System.out.println("compactJws = " + compactJws);
		
		return compactJws;
	}

	public String desCompactJws(String compactJws) {
		String desCompactJws = "";
		try{
			desCompactJws = Jwts.parser()
					.setSigningKey(key)
					.parseClaimsJws(compactJws)
					.getBody()
					.getSubject();
			
			System.out.println("desCompactJws = " + desCompactJws);
			
		}catch (MalformedJwtException e) {
			return "Invalid Token";
		}
		return desCompactJws;
	}
}