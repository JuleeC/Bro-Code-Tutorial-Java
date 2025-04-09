using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp48
{
    internal class Schueler
    {
        public int Katalognummer;
        public string Vorname;
        public string Nachname;
        public int Betrag;

        public void PrintData()
        {
            Console.WriteLine(Katalognummer);
            Console.WriteLine(Vorname);
            Console.WriteLine(Nachname);
            Console.WriteLine(Betrag);
            Console.WriteLine("-------------");

        }

    }
}
