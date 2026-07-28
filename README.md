# PokeAPI RecyclerView

Aplicativo Android desenvolvido em Kotlin para consumir e exibir dados de Pokémon em uma lista utilizando a PokeAPI e o componente RecyclerView.

O projeto foi desenvolvido com foco em organização, separação de responsabilidades e boas práticas de arquitetura, utilizando MVVM, Clean Architecture, modularização e injeção de dependências com Hilt.

A aplicação apresenta os Pokémon em uma interface organizada, exibindo seus nomes e imagens de forma dinâmica.

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Hilt](https://img.shields.io/badge/Hilt-Dependency%20Injection-blue?style=for-the-badge)
![Retrofit](https://img.shields.io/badge/Retrofit-API%20Client-48B983?style=for-the-badge)
![Glide](https://img.shields.io/badge/Glide-Image%20Loading-orange?style=for-the-badge)
![JUnit](https://img.shields.io/badge/JUnit-Unit%20Testing-25A162?style=for-the-badge)



## Preview

<p align="center">
  <img width="1916" height="1195" alt="image" src="https://github.com/user-attachments/assets/c2751e46-2c75-4f2b-a913-9ba610721868" />
</p>

## Funcionalidades

- Consumo de dados da PokeAPI;
- Listagem de Pokémon utilizando RecyclerView;
- Exibição do nome e da imagem de cada Pokémon;
- Carregamento de imagens utilizando Glide;
- Comunicação com a API utilizando Retrofit;
- Gerenciamento do estado da tela por meio de ViewModel;
- Injeção de dependências utilizando Hilt;
- Organização do projeto com arquitetura MVVM;
- Separação de responsabilidades baseada em Clean Architecture;
- Projeto estruturado com modularização;
- Código preparado para testes unitários.

  ## Tecnologias utilizadas

### Linguagem e plataforma

- **Kotlin** — linguagem principal do projeto;
- **Android SDK** — plataforma utilizada para o desenvolvimento da aplicação;
- **Gradle** — gerenciamento de dependências e configuração do projeto.

### Arquitetura e organização

- **MVVM** — separação entre interface, estado da tela e regras de apresentação;
- **Clean Architecture** — organização das responsabilidades em camadas independentes;
- **Modularização** — divisão do projeto em módulos como `app`, `core`, `data`, `domain` e `feature`;
- **Clean Code** — aplicação de boas práticas para manter o código legível, reutilizável e de fácil manutenção.

### Bibliotecas e componentes

- **Hilt** — injeção de dependências;
- **Retrofit** — comunicação com a PokeAPI;
- **RecyclerView** — exibição eficiente da lista de Pokémon;
- **Glide** — carregamento e exibição das imagens;
- **ViewModel** — gerenciamento dos dados e do estado da tela;
- **View Binding** — acesso seguro aos componentes dos layouts.

### Testes

- **JUnit** — criação e execução de testes unitários;
- **Mockito** — criação de dublês para simular dependências;
- **Fake Test Double** — implementação controlada com comportamento funcional real para os testes.
