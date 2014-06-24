using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment1
{
    class Program
    {
        static void Main(string[] args)
        {
            // test 
            try
            {
                Product floo = new Product(1, "Floo Powder", 5, 5.00);
                Product cased = new Product(2, "Cased", 5, 3.00);
                Inventory inventory = new Inventory();
                inventory.addProduct(floo);
                inventory.addProduct(cased);
                inventory.ListProducts();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
                Console.ReadLine();
            }
        }
    }
}
