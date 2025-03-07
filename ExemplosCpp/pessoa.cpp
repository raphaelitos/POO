#include "pessoa.hpp"

void Pessoa::setNome(const string &nome)
{
    this->nome=nome;
} 

const string &Pessoa::getNome() const
{
    return nome;
}

void Pessoa::setIdade(const int &idade)
{
    this->idade=idade;
}

const int &Pessoa::getIdade() const
{
    return idade;
}