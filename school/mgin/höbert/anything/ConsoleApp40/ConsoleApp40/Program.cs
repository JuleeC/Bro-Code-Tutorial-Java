using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp40
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Random rnd = new Random();
            int[] arr = new int[200];
            int[] zähler = new int[100];
            for (int i = 0; i < arr.Length; i++)
            {
                arr[i] = rnd.Next(1, 100);
                Console.Write("{0, 4}", arr[i]);

                
                if (arr[i] == i)
                    zähler[i]++;
                
            }
            
            

        }
    }
}
