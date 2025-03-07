#include "departamento.hpp"

void Departamento::setNome(const string &nome){
    this->nome = nome;
}
const string &Departamento::getNome() const{
    return this->nome;
}
void Departamento::setId(const int &id){
    this->id = id;
}
const int &Departamento::getId() const{
    return this->id;
}

void Departamento::ImprimeDep(const Departamento &d){
    cout << "Nome: " << this->nome;
    cout << "Id: " << this->id;
}
