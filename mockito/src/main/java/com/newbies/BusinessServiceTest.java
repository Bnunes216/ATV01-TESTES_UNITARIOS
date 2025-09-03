// src/test/java/com/newbies/BusinessServiceTest.java
package com.newbies;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

// 1. Habilita a integração do Mockito com o JUnit 5
@ExtendWith(MockitoExtension.class)
class BusinessServiceTest {

    // 2. Cria um mock da interface DataRepository
    @Mock
    private DataRepository dataRepositoryMock;

    // 3. Cria uma instância de BusinessService e injeta os mocks (dataRepositoryMock) nela
    @InjectMocks
    private BusinessService businessService;

    @Test
    void testFindTheGreatestFromAllData() {
        // Arrange (Organizar)
        // 4. Define o comportamento do mock: quando o método findAll() for chamado, retorne este array.
        when(dataRepositoryMock.findAll()).thenReturn(new int[]{25, 15, 7, 100});

        // Act (Agir)
        // 5. Chama o método que queremos testar.
        int result = businessService.findTheGreatestFromAllData();

        // Assert (Verificar)
        // 6. Verifica se o resultado é o esperado.
        assertEquals(100, result);
    }

    @Test
    void testFindTheGreatestFromAllData_withEmptyArray() {
        // Arrange
        when(dataRepositoryMock.findAll()).thenReturn(new int[]{});

        // Act
        int result = businessService.findTheGreatestFromAllData();

        // Assert
        assertEquals(Integer.MIN_VALUE, result);
    }
}
