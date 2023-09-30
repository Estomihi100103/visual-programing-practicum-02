//12S23038 -Alya Triswani

Function Main
    Declare String nama, ac, lantai, teknologi, gudang
    Declare Integer kapasitas, jumlah, skor, x

    Input nama
    Input kapasitas
    Input jumlah
    Input ac
    Input lantai
    Input teknologi
    Assign skor = (jumlah/kapasitas)*100
    If skor>=40
        Assign gudang = "gudang elit"
    Else
        If skor<40 and skor>=25
            Assign gudang = "gudang standar"
        Else
            If skor<25
                Assign gudang = "gudang perlu peningkatan"
            End
        End
    End
    Output gudang&"|"&kapasitas&"|"&jumlah&"|"&ac&"|"&lantai&"|"&teknologi&"|"&skor&"|"&gudang
End
