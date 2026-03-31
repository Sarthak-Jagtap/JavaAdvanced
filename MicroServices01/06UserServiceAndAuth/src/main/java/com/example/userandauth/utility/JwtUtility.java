package com.example.userandauth.utility;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.example.userandauth.model.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtility {
	
	private final String SECRET = "mysecretkeymysecretkeymysecretkey123";
	private final Key key = Keys.hmacShaKeyFor(SECRET.getBytes());	
	
	public String generateToken(User user) {
	    return Jwts.builder()
	            .setSubject(user.getUsername())
	            .claim("role", user.getRole())
	            .setIssuedAt(new Date())
	            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
	            .signWith(key)
	            .compact();
	}
	
	public String extractUsername(String token) {
	    return Jwts.parserBuilder()
	            .setSigningKey(key)
	            .build()
	            .parseClaimsJws(token)
	            .getBody()
	            .getSubject();
	}
}
