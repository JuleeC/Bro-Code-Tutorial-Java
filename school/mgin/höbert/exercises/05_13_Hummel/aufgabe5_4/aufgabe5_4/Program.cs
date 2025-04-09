using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting.Messaging;
using System.Text;
using System.Threading.Tasks;

namespace aufgabe5_4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Konto konto1 = new Konto();
            Konto konto2 = new Konto();

            Console.WriteLine(konto1.Einzahlen(50));
            Console.WriteLine(konto1.Abheben(50,"p"));
            Console.WriteLine(konto2.Einzahlen(5000));
            Console.WriteLine(konto1.Abheben(50,"a"));
        }
    }
    class Konto
    {
        string name;
        int kontostand=10;
         string passwort1= "p";

        public int Einzahlen(int betrag)
        {
            if (betrag <= 1000)
            {
                return kontostand += betrag;
            }
            else return 0;
            
        }
        public int Abheben(int betrag, string passwort)
        {
            if (kontostand >= 0 && passwort1 == passwort)
            {


                return kontostand -= betrag;
            }
            return kontostand;
        }
        


    }
}
