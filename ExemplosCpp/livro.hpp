#if !defined(LIVRO_HPP)
#define LIVRO_HPP

#include "pessoa.hpp"

class Livro
{
    Pessoa* autorPtr;               // usamos ponteiro aqui para permitir a alteração do autor
    public:
    Livro(Pessoa &autor);
    Pessoa &getAutor() const;
    void setAutor(Pessoa &autor);
};

#endif // LIVRO_HPP
