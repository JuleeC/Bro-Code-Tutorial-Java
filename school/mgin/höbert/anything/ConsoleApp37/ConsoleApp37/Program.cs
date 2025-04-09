using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp37
{
    internal class Program
    {
        static void Main(string[] args)
        {
           
            double[] pot = new double[16];
          
            for (int i = 0; i < pot.Length;i++)
            {
                pot[i] = Math.Pow(i, 2);
                Console.WriteLine(pot[i]);
                
             
            }
        }
    }
}
