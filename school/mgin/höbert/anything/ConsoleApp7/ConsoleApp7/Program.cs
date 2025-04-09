using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //ab 90Sehr Gutab 75Gutab 60Befriedigendgrößer 50Genügend50 und wenigerNicht Genügend

            int x = Convert.ToInt32(Console.ReadLine());

            if (x >= 90)
            {
                Console.WriteLine("Sehr Gut");

            }
            else if (x >= 75)
            {
                Console.WriteLine("Gut");
            }
            else if (x >= 60)
            {
                Console.WriteLine("Befriedigend");
            }
            else if (x > 50)
            {
                Console.WriteLine("Genügend");
            }
            else if (x < 50)
            {
                Console.WriteLine("Nicht genügend");
            }
        }
    }
}
