# Getting Started 

## Pré requisitos:

- IDE de sua preferencia
- Java
- Springboot
- Maven
- Rode sua API de integracao via **Browser**, **Postman** ou **Insomnia** via chamada http.


## Bem-vindo ao projeto Spring AI!

O projeto Spring AI fornece uma API e abstrações compatíveis com Spring para o desenvolvimento de aplicativos de IA.

Para obter mais informações, acesse a documentação de referência do Spring AI!

## Esta perdido, comece por aqui: 

- Spring Initializr (https://start.spring.io/)
  - Podera optar pelo recuso Maven
  - Java
  - 3.1.12 (SNAPSHOT)
  - Adicione suas expecificacoes em seu projeto
  - Packing para Jar 
  - Versao Java (sua escolha) -> Versao usada neste projeto: 17

### Referencia de Documentacao: 

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.12-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.12-SNAPSHOT/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.12-SNAPSHOT/reference/htmlsingle/index.html#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.12-SNAPSHOT/reference/htmlsingle/index.html#using.devtools)

### Guides:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)


# Para mais detalhes de dependencias use o arquivo: ```pom.xml ```

## Visão geral
Apesar da extensa história da IA, o papel do Java neste domínio tem sido bem maior. A maioria das ferramentas de ML/AI foram construídas em torno do ecossistema Python. No entanto, o progresso recente na IA generativa, estimulado por inovações como o ChatGPT da OpenAI, popularizou a interação com modelos pré-treinados via HTTP. Isso elimina grande parte da dependência de bibliotecas C/C++/Python e abre a porta para o uso de linguagens de programação como Java.

As bibliotecas LangChain e LlamaIndex tornaram-se populares para implementar soluções de IA generativa e podem ser implementadas em outras linguagens de programação. Essas bibliotecas compartilham temas fundamentais com projetos Spring, como:

- Abstrações de serviços portáteis
- Modularidade
- Extensibilidade
- Redução do código padrão
- Integração com diversas fontes de dados
- Soluções pré-construídas para casos de uso comuns

Observe que a API Spring AI não é uma porta direta de LangChain ou LlamaIndex. Você verá diferenças significativas na API se estiver familiarizado com esses dois projetos, embora os conceitos e ideias sejam bastante flexiveis.

## Interagindo com modelos de IA

ChatClient: Um recurso fundamental do Spring AI é uma API de cliente portátil para interagir com modelos generativos de IA. Com esta API, você pode inicialmente direcionar um modelo de bate-papo de IA, por exemplo, OpenAI e, em seguida, trocar facilmente a implementação para outro modelo de bate-papo de IA, por exemplo, o modelo antrópico do Amazon Bedrock. Quando necessário, você também pode usar opções de modelos não portáteis.

Spring AI oferece suporte a muitos modelos de IA. Para uma visão geral, veja aqui. Modelos específicos atualmente suportados são:

OpenAI
Azure OpenAI
Amazon Bedrock (Antrópico, Llama2, Cohere, Titan, Jurassic2)
Abraçando o rosto
Google VertexAI (PaLM2, Gêmeos)
IA Mistral
IA de estabilidade
Ollama
PostgresML
Transformadores (ONNX)
Claude Antrópico3

## Frameworks


- [Langchain4j] (https://docs.langchain4j.dev/get-started/)
    - Leia atentamente sua documentacao para fazer a integracao adequada.

- [ollama] (https://ollama.com/download/windows)
  - Leia atentamente sua documentacao para fazer a integracao adequada.
  - Apos instalar abrir o cmd e startar-lo com 

```
ollama run llama3
```

Para saber a versao ollama:

```
ollama -v
```

Com a versao llma3 instalada sera possivel rodar o projeto localmente.






