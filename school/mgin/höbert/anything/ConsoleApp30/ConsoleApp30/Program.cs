using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp30
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(GgT1(6,9));
        }

        static int GgT1(int a, int b)
        {
            int min = Math.Min(a, b);
            int max = 0;

            for (int i = 1; i <= min; i++)
            {
               if( a % i == 0 && b % i == 0)
                {
                    max = i; 
                }

            }
            return max;
        }
    }
}
