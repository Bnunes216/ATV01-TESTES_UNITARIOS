package com.example;

import com.newbies.example.RepositorioUsuario;
import com.newbies.example.ServicoLogin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

// Importações estáticas para facilitar a escrita dos testes
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

// 1. Habilita a integração do Mockito com o JUnit 5
@ExtendWith(MockitoExtension.class)
public class ServicoLoginTest {

    // 2. Anotação para criar um "mock" (um objeto falso) da nossa dependência.
    @Mock
    private RepositorioUsuario repositorioMock;

    // 3. Anotação para criar uma instância da classe que queremos testar
    // e injetar automaticamente os mocks criados com @Mock nela.
    @InjectMocks
    private ServicoLogin servicoLogin;

    @Test
    void quandoUsuarioESenhaCorretos_deveRetornarTrue() {
        // Arrange (Arranjo) - Preparamos o cenário do teste.
        // Aqui, "ensinamos" o mock a se comportar como queremos.
        // QUANDO o método 'autenticar' for chamado com "admin" e "senha123",
        // ENTÃO retorne 'true'.
        when(repositorioMock.autenticar("admin", "senha123")).thenReturn(true);

        // Act (Ação) - Executamos o método que queremos testar.
        boolean resultado = servicoLogin.login("admin", "senha123");

        // Assert (Verificação) - Verificamos se o resultado foi o esperado.
        assertTrue(resultado, "O login deveria ser bem-sucedido");

        // Opcional: Verificar se o método do mock foi realmente chamado.
        // Verifique se o método 'autenticar' foi chamado 1 vez com os argumentos exatos.
        verify(repositorioMock, times(1)).autenticar("admin", "senha123");
    }

    @Test
    void quandoUsuarioESenhaIncorretos_deveRetornarFalse() {
        // Arrange
        // Ensinamos o mock a retornar 'false' para credenciais incorretas.
        when(repositorioMock.autenticar("admin", "senha_errada")).thenReturn(false);

        // Act
        boolean resultado = servicoLogin.login("admin", "senha_errada");

        // Assert
        assertFalse(resultado, "O login deveria falhar");

        // Verifica se a interação com o mock aconteceu como esperado.
        verify(repositorioMock).autenticar("admin", "senha_errada");
    }

    @Test
    void quandoUsuarioVazio_deveRetornarFalseSemChamarRepositorio() {
        // Arrange - Nenhum comportamento de mock é necessário, pois o repositório nem deve ser chamado.

        // Act
        boolean resultado = servicoLogin.login("", "senha123");

        // Assert
        assertFalse(resultado, "Login com usuário vazio deveria falhar");

        // Verificação importante: garantimos que a nossa dependência (o repositório)
        // NUNCA foi chamada. O método 'verifyNoInteractions' faz isso.
        verifyNoInteractions(repositorioMock);
    }
}