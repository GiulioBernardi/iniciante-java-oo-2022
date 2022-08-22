# Resultado da modelagem
<p align="center">
  <img src="https://user-images.githubusercontent.com/54187661/185817620-f1e11106-c199-4e3f-93f6-988df520d736.png" />
</p>

## Obs
Para exemplificação da utilização dos métodos, fiz com que a maioria deles retornassem uma String com um texto. A intenção é mostrar que os métodos devem realizar aquela determinada ação. Os únicos métodos que possuem retornos diferentes são da classe Aprendiz, que eu acrescento o nível da habilidade de um aprendiz ou adiciono uma habilidade.

Como dá para ver, usei e abusei de interfaces e classes abstratas a ponto de uma classe modelo herdar uma classe abstrata e implementar outras duas interfaces.
Aprendi a usar HashMap no Java graças a esse desafio

## Exemplo do console ao rodar a main

<p align="center">
  <img src="https://user-images.githubusercontent.com/54187661/185905938-f83b19d9-45bf-4559-bc22-78927fbdbf14.png" />
</p>
Cada linha desse console é exibida pela chamada de cada método das classes.

# iniciante-java-oo-2022

## Desafio

O seu desafio será modelar o programa de aprendizes usando seus conhecimentos de programação orientada a objetos. A intenção é abstrair o máximo que conseguir do que acontece no dia a dia durante o programa.

Para relembrar e dar algumas ideias para a sua modelagem, seguem algumas possíveis descrições do que acontece durante o Movimento:

- O programa de aprendizes é composto por aprendizes, mentores e organizadores
  - Mentores também podem ser organizadores

Cada um dos perfis tem características e funções diferentes no Codar, algumas delas são:

- Aprendizes:
  - Aprendem novas habilidades ou evoluem as existentes
  - Compartilham os resultados e experiências adquiridas 
  - Participam de eventos
  - Trazem dúvidas técnicas, de carreira e outras para os mentores
  - Trazem dúvidas de processos e regras para os organizadores;
- Mentores:
  - Criam e ministram eventos
  - Ajudam os aprendizes no processo de aprendizado sanando possíveis dúvidas e compartilhando experiências
  - Criam, revisam e dão possíveis soluções para desafios de cada módulo
- Organizadores:
  - Criam eventos
  - Ajudam mentores e aprendizes com os processos e regras do movimento

## Pré-requisitos

- Instale o [Git](https://git-scm.com/).
- Faça um fork desse projeto clicando no botão `Fork` no canto superior direito da página, conforme a imagem abaixo. 

<img src="https://docs.github.com/assets/images/help/repository/fork_button.png" alt="Realizando o fork" width="400" />

- Acesse o fork que você criou e faça o clone para a sua máquina. Clique primeiro no botão `Code` e depois copie a URL. 

<img src="https://docs.github.com/assets/images/help/repository/https-url-clone-cli.png" alt="Copiando a URL" width="400" />

- Realize o clone com o comando `git clone` + a URL copiada.

- Abra o projeto na sua IDE ou editor de texto preferido. Se não tiver um recomendamos o [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/).

## Resolvendo o desafio

Seu desafio é utilizar seus conhecimentos de Java e Orientação a Objetos para modelar o Programa de Aprendizes deste ano. Escrever código faz parte do trabalho de um desenvolvedor, mas mais do que isso devemos pensar em criar soluções para problemas. Seu trabalho será pensar, modelar e escrever código em java para aquilo que tem vivido no dia a dia do movimento em uma solução orientada a objetos, implementada na linguagem de programação Java, pensando em como poderia abstrair tudo isso para um software.

### Avisos

- Crie os arquivos e faça a organização do projeto conforme achar necessário
- Fique à vontade para incrementar o seu modelo como preferir
