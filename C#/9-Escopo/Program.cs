using System;
using System.Reflection;

class Programa
{
    static void Main(string[] args)
    {
        int mes = 12;
        double investimento = 1000;
        double rendimento = 0.005;

        for (int i = 1; i <= mes; i++)
        {
            investimento += investimento * rendimento;
            Console.WriteLine("No mês " + i + " voce tem " + investimento);
            if (i == (mes))
            {
                Console.WriteLine(investimento);
            }
        }
        Console.WriteLine("------------------------");

        int mesWhile = 1;
        double investimento2 = 1000;
        while (mesWhile <= 12)
        {
            investimento2 += investimento2 * rendimento;
            Console.WriteLine("No mês " + mesWhile + " voce tem " + investimento2);
            mesWhile++;
            if (mesWhile == 12)
            {
                Console.WriteLine(investimento2);
            }
        }


        Console.WriteLine("Aperte enter para fechar");
        Console.ReadLine();

    }
}