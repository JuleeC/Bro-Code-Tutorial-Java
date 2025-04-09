using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp46
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] arr = new int[9, 9];

            for (int i = 0; i < arr.GetLength(1); i++)
            {


                for (int a = 1; a < arr.GetLength(0); a++)
                {
                    Console.Write(a);
                    Console.BackgroundColor= ConsoleColor.Green;
                }
                Console.WriteLine();
            }
        }
    }
}
