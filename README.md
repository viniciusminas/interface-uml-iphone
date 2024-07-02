# interface-uml-iphone
Repositório criado para cumprir o desafio da UML do iphone e suas interfaces

##Exemplo abaixo, demonstro a UML do Iphone e o funcionamento deste programa em Java.


                             +---------------------+
                             |       iPhone        |
                             +---------------------+
                             | +tocar()            |
                             | +pausar()           |
                             | +selecionarMusica() |
                             | +ligar()            |
                             | +atender()          |
                             | +iniciarCorreioVoz()|
                             | +exibirPagina()     |
                             | +adicionarNovaAba() |
                             | +atualizarPagina()  |
                             +---------------------+
                   /                    |                      \
       +-------------------+ +--------------------+ +------------------------+
       | ReprodutorMusical | | AparelhoTelefonico | |    NavegadorInternet   |
       +-------------------+ +--------------------+ +------------------------+
       | +tocar()          | | +ligar()           | | +exibirPagina()        |
       | +pausar()         | | +atender()         | | +adicionarNovaAba()    |
       | +selecionarMusica()| | +iniciarCorreioVoz() | +atualizarPagina()    |
       +-------------------+ +--------------------+ +------------------------+

