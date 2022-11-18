using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace bytebank_ADM.Funcionarios
{
    public class Auxiliar : Funcionario
    {
        public Auxiliar(string nome, string cpf) : base(nome, cpf, 2000)
        {        }
        public override double GetBonificacao()
        {
            return this.Salario * 0.2; ;
        }
        public override void AumentarSalario()
        {
            this.Salario *= 1.10;
        }
    }
}
