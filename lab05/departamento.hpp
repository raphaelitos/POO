#if !defined(DEPARTAMENTO_HPP)
#define DEPARTAMENTO_HPP

#include <iostream>
#include <string>

using namespace std;

class Departamento{
    string nome;
    int id;
public:
    Departamento(const string &nome, const int &id): nome(nome), id(id){}
    void setNome(const string &nome);
    const string &getNome() const;
    void setId(const int &idade);
    const int &getId() const;
    void ImprimeDep(const Departamento &d);
};

#endif