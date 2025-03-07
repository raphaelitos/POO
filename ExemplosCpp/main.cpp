#include <string>
#include <iostream>

#include "pessoa.hpp"
#include "livro.hpp"
#include "livroimutavel.hpp"

using namespace std;

void imprimePessoa(const Pessoa &p)
{
    cout << p.getNome() << endl;
}

int main()
{
    Pessoa fulano("Fulano", 30);             // construção com parâmetros
    cout << 17 << endl;
    Livro livroDoFulano(fulano);             // sem cópia de pessoa
    cout << 19 << endl;
    fulano.setNome("Fulano da Silva");       // altera a única pessoa no sistema
    imprimePessoa(livroDoFulano.getAutor());    // que tem o seu nome devidamente alterado
    cout << 22 << endl;
    Pessoa x(livroDoFulano.getAutor());         // vai fazer construção por cópia
    x.setNome("Teste");                         // a cópia pode ser alterada à vontade
    // que não altera o nome de fulano, que é o autor do livro:
    imprimePessoa(fulano);
    imprimePessoa(livroDoFulano.getAutor());
    livroDoFulano.getAutor().setNome("Agora sim altera o nome do fulano");
    imprimePessoa(fulano);
    imprimePessoa(livroDoFulano.getAutor());    
}