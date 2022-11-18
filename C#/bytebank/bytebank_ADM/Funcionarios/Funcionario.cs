using Microsoft.Win32.SafeHandles;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace bytebank_ADM.Funcionarios
{
    public abstract class Funcionario
    {
        public string Nome { get; private set; }
        public string Cpf { get; private set; }
        public double Salario { get; protected set; }

        public Funcionario(string nome, string cpf, double salario)
        {
            this.Nome = nome;
            this.Cpf = cpf;
            this.Salario = salario;
        }
        public abstract void AumentarSalario();
        public abstract double GetBonificacao();

        public override string ToString()
        {
            return "-------------------------" +
                "\nFuncionario(a): " + Nome +
               "\nCPF: " + Cpf +
               "\nSalario: " + Salario
               + "\nBonificação: " + GetBonificacao() +
               "\n-------------------------";
        }
    }
}
