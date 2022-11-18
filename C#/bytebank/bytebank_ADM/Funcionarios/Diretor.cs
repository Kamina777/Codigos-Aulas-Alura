using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Transactions;

namespace bytebank_ADM.Funcionarios
{
    public class Diretor : Funcionario
    {

        public Diretor(string nome, string cpf):base(nome, cpf, 5000)
        {
            //base.Nome = nome;
            //base.Cpf = cpf;
            //base.Salario = salario;
        }

        public override double GetBonificacao()
        {
            return this.Salario;
        }
        public override void AumentarSalario()
        {
            this.Salario *= 1.15;
        }

        //public override string ToString()
        //{
        //    return base.ToString() + "\nBonificação: " + GetBonificacao() ;
        //}
    }
}
