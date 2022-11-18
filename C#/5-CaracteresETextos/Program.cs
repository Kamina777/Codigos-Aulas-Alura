using System;

class Programa
{
    static void Main(string[] arg)
    {
        string caractere = "Só queria criar um jogo";
        Console.WriteLine(caractere);

        int idadeJoao = 20;

        bool grupo = idadeJoao > 18;
        Console.WriteLine(grupo);

        if (idadeJoao >= 18)
        {
            Console.WriteLine("Pode Entrar");
        }
        else
        {
            Console.WriteLine("Não pode Entrar");
        }

        Console.WriteLine("Aperte enter para fechar");
        Console.ReadLine();
    }
}