using bytebank.Titular;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace bytebank.Contas
{
    public class ContaCorrente
    {
        private int numeroAgencia; //atribudo do objeto
        private string contaCorrente;//atribudo do objeto
        private double saldo;//atribudo do objeto
        private  Cliente cliente; // recebe uma referencia do tipo Cliente
        public static int quantidadeContasCorrentes { get; private set; } //atributo da CLASSE
        
        public ContaCorrente(Cliente cliente, int numeroAgencia, string contaCorrente)
        {
            this.cliente = cliente;
            this.numeroAgencia = numeroAgencia;
            this.contaCorrente = contaCorrente;
            quantidadeContasCorrentes++;
        } //Construtor
        public void Deposito(double saldo)
        {
            this.saldo += saldo;
            Console.WriteLine("Valor depositado: " + this.saldo);
        } //metodo para depositos
        public void Saque(double saque)
        {
            if (saque > saldo)
            {
                Console.WriteLine("Valor sacado excede o saldo da conta!!!");
            }
            else
            {
                saldo -= saque;
                Console.WriteLine("Valor Sacado: " + saque + " \nSaldo restante: " + saldo);
                //Console.WriteLine("Valor Total: " + this.saldo);
            }
        }//metodo para saques
        public void Transferir(ContaCorrente conta1, double valorTransferencia)
        {
            if (saldo < valorTransferencia)
            {
                Console.WriteLine("Saldo insuficiente");
            }
            else
            {
                saldo -= valorTransferencia;
                conta1.saldo += valorTransferencia;
                Console.WriteLine("Transferido " +
                    valorTransferencia + " da conta " +
                    valorTransferencia + " da conta " +
                    conta1.contaCorrente + " para a conta " + contaCorrente);
            }
        }//metodo para transferencia
        public override string ToString()
        {
            return "********************" +
               "\nNome do titular: " + cliente.Nome +
               "\nAgencia: " + numeroAgencia +
               "\nConta Corrente: " + contaCorrente +
               "\nSaldo: " + saldo;
        }
    }
}
