using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp29
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(Primzahl(7));
        }
        static bool Primzahl(int x)
        {
            bool l = true;
            int z = 2;
            while (z < x--)
            {
                if (x % z != 0)
                {

                     l = false;
                }
                else
                    l = true;
                z++;

            }
            return l;
        }

    }
}

