using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace bytebank.Titular
{
    public class Cliente
    {
        private string nome;
        private string cpf;
        private string profissao;   
        public string Nome
        {
            get { return nome; }
            set { nome = value; }
        } //get e set do nome
        public string Cpf
        {
            get { return cpf; }
            set { cpf = value; }
        }//get e set do cpf
        public string Profissao
        {
            get { return profissao; }
            set { profissao = value; }
        }//get e set do profissao
        public Cliente(string nome, string cpf, string profissao)
        {
            this.Nome = nome;
            this.Cpf = cpf;
            this.Profissao = profissao; ;
        }//Contrutor Cliente
        public override string ToString()
        {
            return "********************" + "\nTitular: " + nome + "\nCPF: " + cpf +
               "\nProfissão: " + profissao;
        }//Override da ToString
    }
}
