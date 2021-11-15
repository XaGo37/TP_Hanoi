package Hanoi;

public class Test {
    static void Hanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod "+ from_rod+" to rod "+to_rod);
            return;
        }
        Hanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk "+ n + " from rod " + from_rod +" to rod " + to_rod );
        Hanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    // Driver code
    public static void  main(String args[])
    {
        int n = 10; // Number of disks
        Hanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }
}
