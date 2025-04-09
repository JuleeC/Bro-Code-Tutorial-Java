using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Gefahrene Kilometer: ");
            double a = Convert.ToDouble(Console.ReadLine());
            Console.Write("Getankte Menge: ");
            double b = Convert.ToDouble(Console.ReadLine());
            Console.Write("Benzinpreis: ");
            double c = Convert.ToDouble(Console.ReadLine());
            double d = b / a * c;


            Console.WriteLine();
           Console.WriteLine("Verbrauch: " + b / a * 100 + " Liter pro 100km");
            Console.WriteLine("Preis: " + d + "EUR/km");

        

        }
    }
}
