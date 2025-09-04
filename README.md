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
# 📊 Testes de Caixa Branca e Caixa Preta

## 🧩 O que é o teste de caixa branca?
O **teste de caixa branca** exige acesso ao código-fonte e ao modelo interno do sistema.  
Permite entender lógica, fluxos de controle, estruturas internas e decisões do código.  
Foco principal: **cobertura profunda do código** — caminhos independentes, decisões lógicas, laços e estruturas de dados.  
👉 Geralmente conduzido por **desenvolvedores ou testadores técnicos**.

---

## 🎁 O que é o teste de caixa preta?
O **teste de caixa preta** avalia o sistema apenas pelas **entradas e saídas**, sem acesso ao código.  
O sistema é visto como uma **“caixa fechada”**, onde se insere dados e observa os resultados.  
Foco principal: **validar funcionalidades de acordo com requisitos e perspectiva do usuário**.  
👉 Pode ser realizado por **QA, stakeholders ou até clientes**.

---

## ⚖️ Vantagens

### ✔️ Vantagens do teste de caixa branca
- 🔍 Alta granularidade nos testes e automação facilitada.  
- 🧠 Cobertura profunda do código, incluindo caminhos e decisões internas.  
- 🛠️ Detecta falhas lógicas complexas.  

### ✔️ Vantagens do teste de caixa preta
- 🧑‍💻 Independência do conhecimento técnico.  
- 🎮 Simula a experiência real do usuário final.  
- 🌍 Pode ser executado por perfis não técnicos.  
- 🎯 Eficiente para falhas de **usabilidade e integração**.  

---

## 🆚 Diferenças entre Caixa Branca e Caixa Preta

| Critério | Caixa Branca 🧩 | Caixa Preta 🎁 |
|-------------------|------------------------------------------|--------------------------------------|
| **Acesso ao código** | Sim, total acesso à estrutura interna | Não, apenas interações externas |
| **Base dos testes** | Estrutura interna, fluxo e cobertura | Requisitos funcionais e comportamentos esperados |
| **Testador ideal** | Desenvolvedores e testadores técnicos | Testadores funcionais, QA, analistas não técnicos |
| **Nível de aplicação** | Unitários, integração e segurança | Funcionais, sistema, aceitação, regressão |
| **Foco** | Qualidade estrutural do código | Validação da funcionalidade externa |

---

## 🔄 Aplicações nos processos de desenvolvimento

- 🧩 **Caixa Branca**: aplicada em fases **iniciais** → testes unitários, integração e análise de cobertura.  
  - Ajuda a validar lógica interna, performance e segurança desde cedo.  

- 🎁 **Caixa Preta**: aplicada em fases **posteriores** → testes funcionais, regressão, aceitação do usuário, integração externa.  
  - Garante que o sistema atende aos requisitos do ponto de vista do usuário.  

👉 Em ambientes **ágeis ou tradicionais**, ambas são **complementares**:  
- Caixa Branca → robustez interna.  
- Caixa Preta → experiência do usuário final.  

---

## 🛠️ Ferramentas

### 🔍 Ferramentas de Caixa Branca
- **JUnit (Java)**: testes unitários (+ JaCoCo para cobertura).  
- **NUnit (.NET)**: equivalente para aplicações .NET.  
- **TestNG (Java)**: suporta unitários, funcionais e integração.  
- **pytest (Python)**: recursos avançados para testes.  
- **JaCoCo, SonarQube**: análise de cobertura e qualidade.  
- **EvoSuite**: geração automática de testes unitários Java.  
- **EvoMaster**: geração automatizada de testes para APIs.  
- **HP Fortify**: análise estática de vulnerabilidades.  

### 🎯 Ferramentas de Caixa Preta
- **Selenium**: automação de testes web (end-to-end).  
- **Postman**: testes e validação de APIs.  
- **Cucumber**: testes BDD (baseados em comportamento).  
- **FitNesse**: testes de aceitação e regressão colaborativos.  
- **Outras**: Cypress, Playwright, RestAssured.
