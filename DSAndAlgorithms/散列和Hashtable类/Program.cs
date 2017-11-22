using System;

namespace 散列和Hashtable类
{
    internal class Program
    {
        private static void Main(string[] args)
        {
            string[] names = new string[99];
            string name;
            string[] someNames = new string[]{"David","Jennifer", "Donnie", "Mayo", "Raymond",
"Bernica", "Mike", "Clayton", "Beata", "Michael"};
            int hashVal;
            for (int i = 0; i < 10; i++)
            {
                name = someNames[i];
                hashVal = SimpleHash(name, names);
                names[hashVal] = name;
            }
            ShowDistrib(names);

            Console.ReadKey();
        }

        private static int SimpleHash(string s, string[] arr)
        {
            int tot = 0;
            char[] cname;
            cname = s.ToCharArray();
            for (int i = 0; i <= cname.GetUpperBound(0); i++)
                tot += (int)cname[i];
            return tot % arr.GetUpperBound(0);
        }

        /// <summary>
        /// 说明散列函数把名字实际放置在数组内的位置
        /// </summary>
        /// <param name="arr"></param>
        private static void ShowDistrib(string[] arr)
        {
            for (int i = 0; i <= arr.GetUpperBound(0); i++)
                if (arr[i] != null)
                    Console.WriteLine(i + " " + arr[i]);
        }

        /// <summary>
        /// 利用霍纳（Horner）法则来计算多项式函数
        /// </summary>
        /// <param name="s"></param>
        /// <param name="arr"></param>
        /// <returns></returns>
        private static int BetterHash(string s, string[] arr)
        {
            long tot = 0;
            char[] cname;
            cname = s.ToCharArray();
            for (int i = 0; i <= cname.GetUpperBound(0); i++)
                tot += 37 * tot + (int)cname[i];
            tot = tot % arr.GetUpperBound(0);
            if (tot < 0)
                tot += arr.GetUpperBound(0);
            return (int)tot;
        }

        private static bool InHash(string s, string[] arr)
        {
            int hval = BetterHash(s, arr);
            if (arr[hval] == s)
                return true;
            else
                return false;
        }
    }
}