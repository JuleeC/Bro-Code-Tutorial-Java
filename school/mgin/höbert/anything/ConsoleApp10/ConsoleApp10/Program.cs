using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x = Convert.ToInt32(Console.ReadLine());

            if (x <= 50)
            {
                Console.WriteLine("Nicht Genügend");

            }
            else if (x >= 51 && x <= 60)
            {
                Console.WriteLine("Genügend");
            }
            else if (x >= 61 && x <= 80)
            {
                Console.WriteLine("Befriedigend");
            }
            else if (x >= 81 && x <= 90)
            {
                Console.WriteLine("Gut");
            }
            else if (x >= 91 && x <= 100)
            {
                Console.WriteLine("Sehr gut");
            }
        }


    }
}
    
 
