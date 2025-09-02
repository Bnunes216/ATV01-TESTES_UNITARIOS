# Pesquisa sobre Frameworks de Teste

## 🧪 TestNG (Java)

Inspirado no JUnit, o TestNG ("Test Next Generation") foi criado para ser mais poderoso, introduzindo funcionalidades que não existiam em seu predecessor e que são especialmente úteis em cenários de testes mais complexos.

### ✅ Pontos Positivos
- 🔖 **Anotações Avançadas e Flexíveis**: Oferece controle granular com `@BeforeSuite`, `@AfterSuite`, `@BeforeGroups`, `@AfterGroups`.
- 🗂️ **Agrupamento de Testes**: Facilita a criação de suítes que executam apenas subconjuntos de testes.
- 🔗 **Testes Dependentes**: Permite definir dependências entre métodos de teste.
- ⚡ **Execução Paralela**: Suporte nativo para reduzir o tempo total da suíte.
- 📊 **Parametrização Nativa**: `@DataProvider` facilita Data-Driven Testing.
- 📑 **Relatórios em HTML**: Geração automática e detalhada de resultados.

### ❌ Pontos Negativos
- 📈 **Curva de Aprendizagem**: Arquivos XML e recursos avançados exigem mais esforço inicial.
- 🛠️ **Configuração Mais Complexa**: Verbosa para projetos simples.
- 👥 **Comunidade Menor que JUnit**: Pode dificultar achar exemplos e soluções específicas.

---

## 🧪 Mockito (Java)

### ✅ Pontos Positivos
- **Isolamento de Unidades** → Permite simular dependências externas (BD, APIs, etc.), focando apenas na lógica da classe testada.  
- **Sintaxe Limpa e Legível** → API fluente com métodos como `when(...)`, `thenReturn(...)` e `verify(...)`, fáceis de entender e manter.  
- **Facilita Testes de Cenários Difíceis** → Simula falhas de rede, exceções e respostas inesperadas sem precisar de ambiente real.  
- **Acelera a Execução dos Testes** → Substitui dependências lentas por *mocks* que retornam instantaneamente.  
- **Verificação de Comportamento (Behavior Verification)** → Além do *stubbing*, permite verificar chamadas de métodos em mocks.  
- **Excelente Integração** → Funciona de forma natural com **JUnit** e **TestNG**, sendo o framework de mocking mais popular no ecossistema Java.  

### ❌ Pontos Negativos
- **Versões Antigas Instáveis** → Não suportavam métodos estáticos, construtores ou privados. As versões novas (com *mockito-inline*) adicionaram suporte, mas ainda pode ser complexo.  
- **Risco de Testes Acoplados à Implementação** → Uso excessivo de `verify` pode gerar testes frágeis que quebram em refatorações sem mudar o resultado final.  
- **Pode Mascarar Problemas de Integração** → Por isolar demais, não detecta falhas que só aparecem quando os componentes reais interagem — sendo necessário complementar com testes de integração.  
