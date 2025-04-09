using ConsoleApp48;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp48
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Schueler schueler1 = new Schueler();
            schueler1.Katalognummer = 1;
            schueler1.Vorname = "Julian";
            schueler1.Nachname = "H";
            schueler1.Betrag = 23;
            Schueler schueler2 = new Schueler();
            schueler2.Vorname = "Florian ";
            schueler2.Katalognummer = 11;
            schueler2.Nachname = "G";
            schueler2.Betrag = 22;
            Schueler schueler3 = new Schueler();
            schueler3.Nachname = "Hummel";
            schueler3.Katalognummer = 12;
            schueler3.Vorname = "Jules";
            schueler3.Betrag = 11;


            Console.WriteLine("schueler 1: " + schueler1.Katalognummer +
                "  " + schueler1.Vorname +
                "  " + schueler1.Nachname +
                "  " + schueler1.Betrag +
                "  ");

            Console.WriteLine("schueler 1: " + schueler1.Katalognummer +
               "  " + schueler2.Vorname +
               "  " + schueler2.Nachname +
               "  " + schueler2.Betrag +
               "  ");

            Console.WriteLine("schueler 1: " + schueler1.Katalognummer +
               "  " + schueler3.Vorname +
               "  " + schueler3.Nachname +
               "  " + schueler3.Betrag +
               "  ");

            Console.WriteLine("-------------");
            schueler1.PrintData();
            schueler2.PrintData();
            schueler3.PrintData();

        }
    }
}
