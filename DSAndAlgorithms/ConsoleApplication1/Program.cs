using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    public struct Name
    {
        private string _fName, _mName, _lName;

        public Name(string first,string middle,string last)
        {
            _fName = first;
            _mName = middle;
            _lName = last;
        }

        public string FName
        {
            get { return _fName; }
            set { _fName = value; }
        }

        public string MName
        {
            get { return _mName; }
            set { _mName = value; }
        }

        public string LName
        {
            get { return _lName; }
            set { _lName = value; }
        }

        public override string ToString()
        {
            return (string.Format("{0}{1}{2}", _fName, _mName, _lName));
        }

        public string Initials()
        {
            return (String.Format("{0}{1}{2}", _fName.Substring(0, 1), _mName.Substring(0, 1), _lName.Substring(0, 1)));
        }

    }

    class Program
    {
        static void Main(string[] args)
        {
            //Name myName=new Name("Michael","Mason","McMillan");
            //string fullName, inits;
            //fullName = myName.ToString();
            //inits = myName.Initials();
            //Console.WriteLine("My name is {0}.", fullName);
            //Console.WriteLine("My initials are {0}.", inits);
            //Console.ReadKey();

            //基准法测试
            DateTime startTime;
            TimeSpan endTime;
            startTime = DateTime.Now;
            endTime = DateTime.Now.Subtract(startTime);

        }

        static void DisplayNums(int[] arr)
        {
            for (int i = 0; i < arr.GetUpperBound(0); i++)
            {
                Console.WriteLine(arr[i]+"");
            }
        }

    }
}
