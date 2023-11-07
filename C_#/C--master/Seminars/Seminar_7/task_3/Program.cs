﻿//задайте двумерный массив m x n
// найти элементы с нечетным индексом и возвести в квадрат
Console.Write("Input m--> ");
bool isParsed_1 = int.TryParse(Console.ReadLine(),out int m);
Console.Write("Input n--> ");
bool isParsed_2 = int.TryParse(Console.ReadLine(),out int n);
Console.WriteLine($"Array {m} x {n}:");
if(!isParsed_1 || !isParsed_2)
{
    Console.WriteLine("Error");
    return;
}

int [,] array = CreateRandom2DArray(m,n);
Print2Darray(array);
int [,] array_2 = PowNumberInArray(array);
Print2Darray(PowNumberInArray(array_2));

int[,] CreateRandom2DArray(int num_m, int num_n)
{
    int[,] array = new int [num_m, num_n];
    Random random = new Random();
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            array[i,j] = random.Next(1,10);
        }
    }
    return array;
}
void Print2Darray(int [,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            Console.Write($"{array[i,j]} ");
        }
        Console.WriteLine();
    }
    Console.WriteLine();
}
int[,] PowNumberInArray(int [,] array)
{
    for (int i = 0; i < array.GetLength(0); i++)
    {
        for (int j = 0; j < array.GetLength(1); j++)
        {
            if (i % 2 != 0 & j%2 != 0)
            {
                array[i,j] = array[i,j] * array[i,j];
            }
        }
    }
    return array;
}