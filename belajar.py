print("=== Program Kelulusan Mahasiswa ===")

nama = input("Masukkan nama mahasiswa: ")
nim = input("Masukkan NIM: ")

try:
    nilai = float(input("Masukkan nilai (0-100): "))

    if nilai < 0 or nilai > 100:
        print("Nilai harus berada di antara 0 sampai 100.")
    else:
        print("\n=== Hasil ===")
        print("Nama mahasiswa:", nama)
        print("NIM            :", nim)
        print("Nilai          :", nilai)

        if nilai < 50:
            print("Status         : Tidak Lulus")
        else:
            print("Status         : Lulus")
except ValueError:
    print("Input nilai tidak valid. Masukkan angka, misalnya 45 atau 82.5.")
