using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp22
{
    internal class Program
    {
        static void Main(string[] args)
        {

            int x = Convert.ToInt32(Console.ReadLine());
            int y = 1;
            int z = 0;

            while (y >= 1)
            {
                y = x % 10;
                x = x / 10;
                z = y + z;
                Console.WriteLine(z);

            }
        }
    }
}
