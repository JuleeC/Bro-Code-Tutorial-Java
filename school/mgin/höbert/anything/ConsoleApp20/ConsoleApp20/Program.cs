using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp20
{
    internal class Program
    {
        static void Main(string[] args)
        {
           int x = Convert.ToInt32(Console.ReadLine());
            int z = 1;
                int y = 1;

            while (x >= y)
            {
                z = z * y;
                y++;
                Console.WriteLine(z);
            }
        }

    }
}

