#include "livroimutavel.hpp"

LivroImutavel::LivroImutavel(Pessoa &autor) : autor(autor) {};

Pessoa &LivroImutavel::getAutor() const
{
    return this->autor;
}

// não faça isso, pois vai *sobreescrever* o autor que foi passado na construção do livro
// void LivroImutavel::setAutor(Pessoa &autor)
// {
//     this->autor=autor;
// }