using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp28
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int x = 1;
            
         
                while (x == 1)
            {
                 x = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine(Tripple(5));
                x--;
              
                
                

                }
               
            
        }
        static double Tripple(double x)
        {
            x = x * 3;
            return x;
        }
    }
}
