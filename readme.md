# GolfArena App

- Alunos : Luiz Fernando Vilarga Vilalva

GolfArena é uma plataforma completa para competições de golfe, permitindo que administradores, jogadores e amantes do esporte interajam de forma personalizada. Com login e cadastro, os usuários podem atuar em múltiplos perfis: **Administradores** organizam competições e gerenciam participantes; **Jogadores** podem se inscrever em competições (após preencher um formulário de dados específicos) e devem respeitar a regra de uma competição por dia; e **Amantes do Esporte** acompanham as competições sem necessidade de login, mas podem favoritar eventos ao se cadastrarem. O app promove o engajamento com o golfe de maneira prática e intuitiva, atendendo diferentes tipos de usuários em um único ambiente.

## Cadastro e Perfis

- Será permitido que o usuário crie seu próprio perfil, posteriormente caso se interesse, poderá submeter ao cadastro de Jogador.
- Um administrador, só pode ser criado a partir de um outro admin
- Caso não seja admin e nem seja jogador, será entitulado como "Amante do esporte", usuário comum. Neste caso, não precisa de login para acompanhar os jogadores e campeonatos.

## Funcionalidades por Perfil

### Administrador:
-   Possui acesso a um painel administrativo para gerenciar competições (criação, edição e exclusão) e gerenciar usuários.
-   Para usuários com múltiplos perfis (como administrador e jogador), ao acessar competições, o sistema verifica se ele deseja atuar como jogador (inscrição) ou como administrador (gestão).

### Jogador:

-   Precisa preencher um formulário de dados específicos de jogador de golfe, que pode incluir informações como handicap, clube, etc.
-   Após o cadastro como jogador e aprovação dos dados(de um admin), o jogador pode visualizar e se inscrever em competições disponíveis, respeitando a regra de **uma competição por dia**.

### Amante do Esporte:

-   Sem login, tem acesso a uma lista de competições e pode visualizar informações básicas.
-   Com login, o usuário pode **favoritar competições** para acessá-las facilmente, e pode ser Jogador.
