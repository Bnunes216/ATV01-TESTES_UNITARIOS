package com.newbies.example;

// Esta interface representa nosso "banco de dados" ou qualquer outra dependência externa.
public interface RepositorioUsuario {
    /**
     * Verifica se as credenciais do usuário são válidas.
     * @param usuario O nome do usuário.
     * @param senha A senha do usuário.
     * @return true se as credenciais forem válidas, false caso contrário.
     */
    boolean autenticar(String usuario, String senha);
}
