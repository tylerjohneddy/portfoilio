using System;

namespace src
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("enter the sentance you would like to be checked:");
            String input = Console.ReadLine();
            String output = "False";
            string[] arrayInput = input.Split(" ");
           
            for(int i = 0; i<arrayInput.Length-1;i++){
                int len = arrayInput[i].Length;
                try{
                    
                   if( arrayInput[i][len-1].Equals(arrayInput[i+1][0])){
                        output = "True";

                    }
                }catch{
                    
                }
                      
            }
            Console.WriteLine(output);

        }
    }
}
