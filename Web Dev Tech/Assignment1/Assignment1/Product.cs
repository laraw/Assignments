using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment1
{
    class Product 
    {
        public int code
        {
            get
            {
                return code;
            }
            private set { ;}
        }
        public string name { get; set; }
        public int qty
        {
            get
            {
                return qty;
            }
            private set { ;}
        }
        public double price
        {
            get
            {
                return price;
            }
            private set { ;}
        }

        public Product(int code, string name, int qty, double price)
        {
            this.code = code;
            this.name = name;
            this.qty = qty;
            this.price = price;
        }



        public void returnitem(int qty)
        {
            this.qty = this.qty + qty;
        }

        public bool sellitem(int qty)
        {
            if (qty > 0)
            {
                this.qty = this.qty - qty;
                return true;
            }
            else
            {
                return false;
            }

        }

      

        public override string ToString()
        {
            return this.code + ";" + this.name + ";" + this.price + ";" + this.qty;
        }
    }
}