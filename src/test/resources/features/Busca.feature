#language: pt

@ALE-all
Funcionalidade: Realizar uma busca 
  	Eu como usuário 
  		Quero localizar um endereço no site dos correios
  		Por CEP ou Logradouro

  @ALE-01
  Cenario: Realizar busca por CEP
    Dado que esteja na pagina inicial
    Quando inserir um CEP valido
    Entao validar endereco encontrado
    
  @ALE-02
  Cenario: Realizar busca por Logradouro
    Dado que esteja na pagina inicial
    Quando inserir um Logradouro
    Entao validar enderecos encontrados
