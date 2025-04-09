using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp26
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double x = Convert.ToInt32(Console.ReadLine());

            Verdoppeln(x);
            Halbieren(x);


        }
        static void Verdoppeln(double x)
        {
            x = x * 2;
            Console.WriteLine(x);

        }

        static void Halbieren(double x)
        {

            double a = x / 2;
            Console.WriteLine(a);
        }

    }
}
