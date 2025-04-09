using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp14
{
    internal class Program
    {
        static void Main(string[] args)
        {

            for (int i = 100; i <= 500; i++)
            {
                if (i % 4 == 0 || i % 7 == 0)
                {
                    Console.WriteLine(i);
                }
            }
            
        }
    }
}
