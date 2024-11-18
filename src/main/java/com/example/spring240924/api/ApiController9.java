package com.example.spring240924.api;

import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/main9")
public class ApiController9 {
  final JwtEncoder jwtEncoder;

  @GetMapping("sub1")
  public String sub1() {
    System.out.println("ApiController9.sub1");
    
    //claim: who, for whom, when, until
    JwtClaimsSet claims = JwtClaimsSet.builder()
            .issuer("self") //누가
            .subject("son") //for 누구
            .issuedAt(Instant.now()) //언제 생성
            .expiresAt(Instant.now().plusSeconds(30600)) //언제까지
//            .claim("scope", "admin manager user") //권한
            .build();

    return jwtEncoder.encode(JwtEncoderParameters.from(claims))
            .getTokenValue();
  }
}
