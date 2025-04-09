using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a, b, erg1, erg2, erg3;
            Console.WriteLine("Zahl 1 : ");
           a = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Zahl 2 : ");
            b = Convert.ToInt32(Console.ReadLine());

            erg1 = a * b;
            erg2 = ++a;
            erg3 = erg2 * b;

            Console.WriteLine("Das Ergebnis ist : " + erg1 * erg2 * erg3);



        }
    }
}