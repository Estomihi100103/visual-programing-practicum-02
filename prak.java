Function Main
    Declare String NamaGudang
    Declare Integer KapasitasGudang
    Declare Integer JumlahBukuSaatIni
    Declare String AC
    Declare String Lantai
    Declare String KetersediaanTeknologi
    Declare Integer GudangElite
    Declare Integer GudangStandar
    Declare Integer GudangPerluPeningkatan
    Declare Integer Skor
    Declare String Hasil

    Input NamaGudang
    Input KapasitasGudang
    Input JumlahBukuSaatIni
    Input AC
    Input Lantai
    Input KetersediaanTeknologi
    Assign Skor = (JumlahBukuSaatIni/KapasitasGudang)*100
    If Skor>=40
        Assign Hasil = "GudangElite"
    Else
        If Skor>=25
            Assign Hasil = "GudangStandar"
        Else
            If Skor<25
                Assign Hasil = "GudangPerluPeningkatan"
            End
        End
    End
    Output NamaGudang&"|"&KapasitasGudang&"|"&JumlahBukuSaatIni&"|"&AC&"|"&Lantai&"|"&KetersediaanTeknologi&"|"&Skor&"|"&Hasil
End
