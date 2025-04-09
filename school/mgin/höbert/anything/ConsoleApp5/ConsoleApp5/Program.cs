using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int sekunden1, minuten, stunden, sekunden;
            Console.WriteLine("Bitte geben Sie die Zeit in Sekunden ein");
            sekunden1 = Convert.ToInt32(Console.ReadLine());
            sekunden = sekunden1;
            minuten = sekunden % 60;
            stunden = minuten % 60;

           
            Console.WriteLine("genauer =" + stunden + "Stunden, " + minuten + "Minuten, " + sekunden + "Sekunden ");
        }
    }
}
