using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp39
{
    internal class Program
    {
        
        static void Main(string[] args)
        {
           
            Random rnd = new Random();
            int[] arr = new int[200];
            
            


                for (int i = 0; i < arr.Length; i++)
                {
                    arr[i] = rnd.Next(1, 101);
                    Console.Write("{0,4}", arr[i]);


                 
                }

                Console.WriteLine();

            

           

        }
    }
}
