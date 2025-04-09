using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp15
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for (int i = 1; i <= 20; i++)
            {
               
                int zahl;
                if (i >= 10)
                {

                    zahl = 20 - i;
                    Console.WriteLine(zahl);
                } else
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}
