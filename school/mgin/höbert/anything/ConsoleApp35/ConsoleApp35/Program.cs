using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Versioning;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp35
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for (int i = 1; i <= 10; i++)
            {

                for (int b = 1; b <= 4; i++)
                {

                    for (int a = 1; a <= 4; a++)
                    {
                        if (i != b && b != a)
                        {
                            Console.WriteLine("{0} | {1} | {2}", i, b, a);
                        }
                    }
                }
            }
        }
    }
}

