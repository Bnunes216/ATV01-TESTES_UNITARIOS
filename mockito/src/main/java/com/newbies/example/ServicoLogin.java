package com.newbies.example;

public class ServicoLogin {

    private final RepositorioUsuario repositorioUsuario;

    // A nossa classe de serviço DEPENDE de um RepositorioUsuario.
    // Isso é chamado de Injeção de Dependência.
    public ServicoLogin(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    /**
     * Tenta realizar o login de um usuário.
     * @param usuario O nome do usuário.
     * @param senha A senha.
     * @return true se o login for bem-sucedido, false caso contrário.
     */
    public boolean login(String usuario, String senha) {
        if (usuario == null || usuario.isEmpty() || senha == null || senha.isEmpty()) {
            return false;
        }

        // Delega a responsabilidade de autenticar para sua dependência.
        return repositorioUsuario.autenticar(usuario, senha);
    }
}