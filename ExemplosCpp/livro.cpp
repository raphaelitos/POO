#include "livro.hpp"

Livro::Livro(Pessoa &autor) : autorPtr(&autor) {};

Pessoa &Livro::getAutor() const
{
    return *this->autorPtr;
}

void Livro::setAutor(Pessoa &autor)
{
    this->autorPtr=&autor;
}