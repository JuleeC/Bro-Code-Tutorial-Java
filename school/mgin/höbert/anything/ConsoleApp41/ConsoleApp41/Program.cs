using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp41
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[14];

            arr[0] = 12;
            arr[1] = 14;
            arr[2] = 9;
            arr[3] = 12;
            arr[4] = 15;
            arr[5] = 16;
            arr[6] = 15;
            arr[7] = 15;
            arr[8] = 11;
            arr[9] = 8;
            arr[10] = 13;
            arr[11] = 13;
            arr[12] = 15;
            arr[13] = 12;
            
        
                Console.WriteLine(arr.Average());
                Console.WriteLine(arr.Min());
                Console.WriteLine(arr.Max());
                Array.Sort(arr);
                Console.WriteLine(arr[0] + " " + arr[13]);

            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine("arr[{0}]   |  "+ arr[i],i);

            }











        }
    }
}
