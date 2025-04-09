using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp44
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] arr= new int[8, 8];

            for (int i = 0; i < arr.GetLength(0); i++)
            {
                Console.WriteLine(arr[0, i]);
            }

           
        }
    }
}
