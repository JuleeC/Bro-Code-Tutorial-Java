using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp9
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double x = Convert.ToInt32(Console.ReadLine());
            int z = 0;
            if (x >= 20) {
                
                z++;
                x++;
            }
            else if (x < 5)
            {
                z = z + 2;
                x = x / 2;
            }
            else
            {
                x = x * 3;
            }
                Console.WriteLine(x + " und " + z) ;
        }
    }
}
