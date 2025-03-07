#include "departamento.hpp"
#include <map>
#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

int main(){
    map<int, Departamento> departments;

    ifstream in("departamentos.csv");

    string cell, name;

    string line;
    while(getline(in, line)){
        istringstream lineStream(line);

        getline(lineStream, name, ';');

        getline(lineStream, cell, ';');
        int id = stoi(cell);

        departments.insert({id, Departamento(name, id)});
    }

    for(const auto &[id, department] : departments){
        cout << "Departamento: " << department.getId() << ", " << department.getNome() << endl;
    }

}