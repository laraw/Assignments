using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment1
{
    class Inventory
    {
        List<Product> products = new List<Product>();

        public Inventory()
        {

        }

        public void addProduct(Product product)
        {
            products.Add(product);
        }

       
        public void removeProduct(int code)
        {
            foreach (Product product in products)
            {
                if (product.code == code)
                {
                    products.Remove(product);
                }
            }
        }

        public void buyProduct(int code, int qty)
        {
            foreach (Product product in products)
            {
                product.sellitem(qty);
            }


        }

        public void returnProduct(int code, int qty)
        {
            foreach (Product product in products)
            {
                product.returnitem(qty);
            }
        }
        public void ListProducts()
        {
            foreach(Product product in products) {
                Console.WriteLine("Code: " + product.code);
                Console.ReadLine();
            }
        }
    }
}
