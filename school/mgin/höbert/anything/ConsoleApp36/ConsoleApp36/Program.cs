using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp36
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[8];
            arr[0] = 23;
            arr[1] = 9;
            arr[2] = 7;
            arr[3] = 18;
            arr[4] = 12;
            arr[5] = 31;
            arr[6] = 14;
            arr[7] = 3;

            for (int x = 0; x < 8; x++)
            {
                Console.WriteLine("arr[{0}] = {1}",x, arr[x]);
            }

            for (int x = 0; x < 8; x++)
            {
                arr[x] = x * 2;

            }
            Console.WriteLine();
            for (int x = 0; x < 8; x++)
            {
                Console.WriteLine("arr[{0}] = {1}", x, arr[x]);
            }
            Random rnd = new Random();
            Console.WriteLine(rnd.Next(100, 500));
        }
    }
}
