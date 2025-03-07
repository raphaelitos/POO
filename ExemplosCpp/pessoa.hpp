#if !defined(PESSOA_HPP)
#define PESSOA_HPP

#include <iostream>
#include <string>

using namespace std;

class Pessoa
{
    string nome;
    int idade;
public:
    Pessoa(const Pessoa &p) : nome(p.nome), idade(p.idade)
    {
        cout << "Construtor cópia " << this->nome << endl;
    }
    Pessoa(const string &nome, const int &idade) : nome(nome), idade(idade)
    {
        cout << "Pessoa " << this->nome << " construída " << endl;
    }
    void setNome(const string &nome);
    const string &getNome() const;
    void setIdade(const int &idade);
    const int &getIdade() const;
};

#endif // PESSOA_HPP
