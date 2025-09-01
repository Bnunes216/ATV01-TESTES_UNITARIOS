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

## 🧩 NUnit (C#)

O NUnit é um dos frameworks de teste unitário mais antigos e respeitados do ecossistema .NET. Originalmente portado do JUnit, evoluiu para se tornar idiomático e poderoso para C#.

### ✅ Pontos Positivos
- 🏆 **Maturidade e Estabilidade**: Framework sólido, confiável e com grande base de usuários.
- 🧩 **Conjunto Rico de Atributos**: [Test], [TestCase], [SetUp], [TearDown], [TestFixture], entre outros.
- 🧪 **Excelente Suporte a Testes Parametrizados**: `TestCase` simples e poderoso.
- ⚡ **Execução Paralela**: Suporte robusto para acelerar feedback.
- 🔗 **Boa Integração**: Funciona bem com Visual Studio, CLI e CI/CD.
- 🛠️ **Extensibilidade**: Criação de atributos e assertions customizados.

### ❌ Pontos Negativos
- ✍️ **Sintaxe Mais Verbosa**: Exige mais marcações que o xUnit.net, por exemplo.
- 🐢 **Ritmo de Inovação**: Evolui mais lentamente que frameworks modernos.
- 🔄 **Limitações em Async**: Funciona, mas xUnit traz experiência mais fluida para `async/await`.
