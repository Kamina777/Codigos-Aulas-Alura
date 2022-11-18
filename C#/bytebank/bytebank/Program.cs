using bytebank.Contas;
using bytebank.Titular;
using System.Runtime.CompilerServices;

Cliente matheus = new Cliente("Matheus","122-037-106-83","Não sei");
ContaCorrente contaMatheus = new ContaCorrente(matheus, 142, "360007");
Console.WriteLine(matheus);
Console.WriteLine(contaMatheus);

Cliente dayane = new Cliente("Dayane", "777-777-777-77", " ~~~ ~~~~");
ContaCorrente contaDayane = new ContaCorrente(dayane, 777, "777777");
contaDayane.Deposito(10);

Console.WriteLine(dayane);
Console.WriteLine(contaDayane);
Console.WriteLine(ContaCorrente.quantidadeContasCorrentes);

//contaDayane.transferir(contaMatheus, 5000);


