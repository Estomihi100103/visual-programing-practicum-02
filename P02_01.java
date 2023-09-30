// NIM - Your Name
main()
{
    // Deklarasi variabel
    int a, b, c;
    // Input
    System.out.print("Masukkan nilai a: ");
    a = baca.nextInt();
    System.out.print("Masukkan nilai b: ");
    b = baca.nextInt();
    System.out.print("Masukkan nilai c: ");
    c = baca.nextInt();
    // Proses
    if (a > b)
    {
        if (a > c)
        {
            System.out.println("Nilai a terbesar");
        }
        else
        {
            System.out.println("Nilai c terbesar");
        }
    }
    else
    {
        if (b > c)
        {
            System.out.println("Nilai b terbesar");
        }
        else
        {
            System.out.println("Nilai c terbesar");
        }
    }
    // Output
}
```