
package DTO;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UsuarioDTO {
    private String nome;
    private String email;
    private String senha;

   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // CÓDIGO PARA CRIPTOGRAFIA DE CAMPO SENHA EM SHA-256 HEXADECIMAL
        MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
        byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
        StringBuilder hexString = new StringBuilder();
        for (byte b : messageDigest) {
         hexString.append(String.format("%02X", 0xFF & b));
        }
        String senhahex = hexString.toString();
        this.senha = senhahex;
    }
}
