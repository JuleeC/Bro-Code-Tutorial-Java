using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp27
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x = Convert.ToInt32(Console.ReadLine());
            int y = Convert.ToInt32(Console.ReadLine());
            Potenz(x, y);

        }
        static void Potenz(int x, int y)
        {
            double c = 1;
            while (y > 0) {

                
                c = c * x;
                y--;
                
            
            
            
            }
            while (y < 0)
            {
                c = c * x;
               
                y++;
                if (y >= 0 )
                {
                    c = 1 / c;
                }
            }
            Console.WriteLine(c);
        }
    }
}
