using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace aufgabe5_5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Zahlen zahlen1 = new Zahlen();
            Zahlen zahlen2 = new Zahlen();
            Zahlen zahlen3= new Zahlen();
            Zahlen zahlen4= new Zahlen();
            Zahlen zahlen5 = new Zahlen();
            Zahlen zahlen6 = new Zahlen();
            Zahlen zahlen7 = new Zahlen();
            Zahlen zahlen8 = new Zahlen();
            Zahlen zahlen9 = new Zahlen();
            Zahlen zahlen10 = new Zahlen();

            object[] arr_zahlen = new object[10];
            arr_zahlen[0] = zahlen1;
            arr_zahlen[1] = zahlen2;
            arr_zahlen[2] = zahlen3;
            arr_zahlen[3] = zahlen4;
            arr_zahlen[4] = zahlen5;
            arr_zahlen[5] = zahlen6;
            arr_zahlen[6] = zahlen7;
            arr_zahlen[7] = zahlen8;
            arr_zahlen[8] = zahlen9;
            arr_zahlen[9] = zahlen10;
        }
    }
    class Zahlen
    {

        int a;
        int b;
        int c;
        public int Hoechste(int a, int b, int c)
        {
            if (a > b && a > c)
            {
                return a;
            }
            else if (a < b && b > c)
            {

                return b;
            }
            else if (c > a && c > b)
            {
                return c;
            }
            else
                return 0;

        }
    }
}
