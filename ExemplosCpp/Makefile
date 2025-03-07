all: main

main: main.o pessoa.o pessoa.hpp livro.o livroimutavel.o
	g++ -std=c++17 -o main main.o pessoa.o livro.o  livroimutavel.o

main.o: main.cpp pessoa.hpp
	g++ -std=c++17 -c -o main.o main.cpp

pessoa.o: pessoa.cpp pessoa.hpp
	g++ -std=c++17 -c -o pessoa.o pessoa.cpp

livro.o: livro.cpp livro.hpp pessoa.hpp
	g++ -std=c++17 -c -o livro.o livro.cpp

livroimutavel.o: livroimutavel.cpp livroimutavel.hpp pessoa.hpp
	g++ -std=c++17 -c -o livroimutavel.o livroimutavel.cpp

clean:
	rm *.o
	rm main
