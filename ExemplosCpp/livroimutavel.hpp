#if !defined(LIVROIMUTAVEL_HPP)
#define LIVROIMUTAVEL_HPP

#include "pessoa.hpp"

class LivroImutavel
{
    Pessoa& autor;               // usamos referência, ou seja, não é possível alterar (será fixada necessariamente na construção)
    public:
    LivroImutavel(Pessoa &autor);
    Pessoa &getAutor() const;
    // void setAutor(Pessoa &autor);
};

#endif // LIVROIMUTAVEL_HPP
