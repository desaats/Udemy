﻿using System;
 
 class Program
 {
    static void Main(string[] args)
    {
        int n1, n2, soma, multiplicacao, divisao, diferenca;
        Console.WriteLine("Escreva dois numeros inteiros.");
            n1 = int.Parse(Console.ReadLine());
            n2 = int.Parse(Console.ReadLine());
            soma = n1 + n2;
            diferenca = n1 - n2;
            multiplicacao = n1 * n2;
            divisao = n1 / n2;
         
            Console.WriteLine(" Soma = " + soma);
            Console.WriteLine(" Diferença = " + diferenca);
            Console.WriteLine(" Multiplicação = " + multiplicacao);
            Console.WriteLine(" Divisão = " + divisao);
            
    }

 }