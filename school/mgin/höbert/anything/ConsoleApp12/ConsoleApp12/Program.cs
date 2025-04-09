
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp12
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for (int x = 500;x % 4 == 0 && x  >= 100 ; x--)
            {

                Console.WriteLine(x);
            }
        }
    }
}
