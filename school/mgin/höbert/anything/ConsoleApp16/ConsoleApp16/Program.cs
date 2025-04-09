using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp16
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x = Convert.ToInt32(Console.ReadLine());

            for (int y = 0; y < 10; y = y +2) 
            {
                if (y % 3 != 0)
                {
                    x = x + 4;
                }
                else
                    x++;
            }Console.WriteLine(x);
        }
    }
}
