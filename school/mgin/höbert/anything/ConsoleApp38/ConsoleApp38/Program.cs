using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace ConsoleApp38
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random rnd = new Random();
            int[] arr = new int[10];
            for (int a = 0; a < arr.Length; a++)
            {


                for (int i = 0; i < arr.Length; i++)
                {
                    arr[i] = rnd.Next(1, 11);
                    Console.Write("{0,3}", arr[i]);

                    arr.Count();
                }
                Console.WriteLine(arr.Count()); ;
                Console.WriteLine();
                 
            }
        }
    }
}
