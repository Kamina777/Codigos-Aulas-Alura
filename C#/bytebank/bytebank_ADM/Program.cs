using bytebank_ADM.Bonificacao;
using bytebank_ADM.Funcionarios;
using System.Security.AccessControl;

Diretor matheus = new Diretor("Matheus Alves", "122.037.106-83");
Designer dayane = new Designer("Dayane", "777.777.777-77");
GerenciamentoBonificacao gb = new GerenciamentoBonificacao();

Console.WriteLine(matheus);
Console.WriteLine(dayane);

gb.Registrar(matheus);
gb.Registrar(dayane);

Console.WriteLine(gb.TotalBonificacao); 
