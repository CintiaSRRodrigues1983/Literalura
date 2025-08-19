🚀**LITERALURA**🚀

Este projeto é uma aplicação Java com Spring Boot para gerenciamento de catálogo de livros, criada para o desafio LiterAlura da Alura.
O sistema integra-se à API Gutendex para importar livros e autores, e armazena todas as informações em um banco PostgreSQL, permitindo buscas e consultas diversas através do terminal.




 **🛠️*FUNCIONALIDADES⚒️**
 
.Buscar livro pelo título: Consulta a API Gutendex, importa o livro escolhido e salva no banco de dados.

.Listar livros registrados: Exibe todos os livros salvos localmente.

.Listar autores registrados: Mostra todos os autores cadastrados.

.Listar autores vivos em determinado ano: Informa quais autores, segundo o cadastro, estavam vivos no ano informado.

.Listar livros em determinado idioma: Permite consultar livros pelo idioma (PT, EN, ES, FR).

.Persistência em PostgreSQL: Todo o catálogo fica salvo para as consultas futuras.





**👩‍💻TECNOLOGIAS UTILIZADAS👩‍💻**

.Java 17+

.Spring Boot

.Spring Data JPA

.PostgreSQL

.API Gutendex

.Maven




**💻 COMO RODAR O PROJETO 💻**


**1. Clone o Repositório:**

  1 - git clone https://github.com/seuusuario/literalura.git
  
  2 - cd literalura

  

**2. Configure o Banco de Dados:**
   
   No arquivo src/main/resources/application.properties ajuste:

    1 - spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
   
    2 - spring.datasource.username=SEU_USUARIO
   
    3 - spring.datasource.password=SUA_SENHA
   
    4 - spring.jpa.hibernate.ddl-auto=update
   

**3. Rode o projeto pela sua IDE ou terminal:**

   1 - ./mvnw spring-boot:run
   

Ou execute a partir da sua IDE (IntelliJ/Eclipse/etc).



**🧾COMO USAR🧾** 

Ao iniciar, um menu interativo será exibido no terminal. Basta digitar o número desejado e seguir as instruções.
Você pode buscar livros pela API, cadastrar no banco, consultar autores, filtrar por idioma e mais.



**📁ESTRUTURA DE PASTAS:📂**

1.src/main/java/br/com/aluracursos/literalura

2.└── dto         # Objetos de transferência de dados (DTOs)

3.└── model       # Entidades JPA (Livro, Autor)

4.└── repository  # Interfaces de acesso a dados Spring Data

5.└── service     # Regras de negócio e integração API



**⭐ CRÉDITOS: ⭐**

.Desafio Proposto pela Alura

.API de livros Gutendex

.Desenvolvido por:  CINTIA SILVEIRA ROSA RODRIGUES
