string [] array = new string [5]{"Vasy","add","Float","Cats","BOB"};

PrintArray(CreateNewArray(array));

string [] CreateNewArray (string [] array)
{
    string [] newArray = new string [array.Length];
    for (int i = 0; i < array.Length; i++)
    {
        if(array[i].Length <= 3)
        {
            newArray[i] = array[i];
        }
    }
    return newArray;
}

void PrintArray(string [] array)
{
    Console.WriteLine();
    for(int i = 0; i< array.Length; i++)
    {
        Console.Write($"{array[i]} ");
    }
    Console.WriteLine();
}