using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp48
{
    internal class aufgabe1
    {
        static void Main(string[] args)
        {

            Kunden k1 = new Kunden("Jules","Hummel",100);

        }
    }
    class Kunden {
        public String Vorname;
        public String Nachname;
        public int Guthaben;

        public Kunden(String Vorname, String Nachname, int Guthaben)
        {
            this.Vorname = Vorname;
            this.Nachname = Nachname;
            this.Guthaben = Guthaben;
        }
    }
}
