# SUDOKU

This repository is a final project (Java GUI) from Object-Oriented Programming Class, Teknik Informatika Universitas Padjadjaran.

[Challenge Guidelines](challenge-guideline.md)

**Project Sudoku (Java GUI) dengan implementasi konsep OOP (Object Oriented Programming) dan Java Swing berbasis GUI. Sudoku adalah sejenis teka-teki logika. Tujuannya adalah untuk mengisikan angka-angka dari 1 sampai 9 ke dalam jaring-jaring 9×9 yang terdiri dari 9 kotak 3×3 tanpa ada angka yang berulang di satu baris, kolom atau kotak**

## Credits

| NPM          | Name                   |
| ------------ | ---------------------- |
| 140810190004 | Nadine Annisa Heartman |
| 140810190012 | M Faiq Al Murtadha     |
| 140810190050 | Elshandi Septiawan     |

## Change log

- **[Sprint Planning](changelog/sprint-planning.md) - (planning date)**

  - Membuat Sprint backlog sari awal hingga akhir
  - Mencari referensi tentang permainan sudoku sekaligus mempelajari dari referensi yang telah dicari
  - Scrum meeting untuk menentukan sprint backlog

- **[Sprint 1](changelog/sprint-1.md) - (date from 17 until 22)**

  - Membuat tampilan ( 9 x 9 ) grid
  - Membuat subgrid ( 3 x 3 )
  - Mengeset angka agar hanya angka 1 sampai 9
  - Mengeset hint ( 4 x 9 ubin )
  - Mengeset hint read only
  - Membuat random posisi hint

- **[Sprint 2](changelog/sprint-2.md) - (date from 22 until 29)**

  - Mengeset difficulty easy / tingkat kesulitan : mudah ( hint 4 x 9 )
  - Mengeset difficulty medium / tingkat kesulitan : sedang ( hint 2 x 9 )
  - Mengeset difficulty hard / tingkat kesulitan : susah ( hint 1 x 9 )
  - Mengeset baris kolom subgrid non duplicate
  - Mengecek koordinat dan mengecek jawaban
  - Mengubah warna ubin yang sudah diinput

- **[Sprint 3](changelog/sprint-3.md) - (date from 30 until 6)**

  - Menghighlight ubin yang bernilai sama di 1 baris, 1 kolom, dan 1 subgrid
  - Membuat tampilan button reset atau restart
  - Membuat tampilan menu bar
  - Mengatur permainan agar menggunakan timer
  - Membuat tampilan pause atau resume
  - Membuat tampilan highscore

## Running The App

- Compile Sudoku.java (javac Sudoku.java)
- Compile SudokuUI.java (javac SudokuUI.java)
- Compile Inputs.java (javac Inputs.java)
- Compile StopWatch.java (javac StopWatch.java)
- Compile Main.java (javac Main.java)
- Jalankan program (java Main)

## Classes Used

TO;DO

![UML](/images/umlSudoku.png)

## Notable Assumption and Design App Details

- Tampilkan grid ubin dengan besar 9 x 9 yang terdiri dari 3 x 3 sub-grids dimana ubin adalah komponen drawing board.
- Acak angka di dalam ubin dengan syarat unik (tidak ada angka yang sama pada 1 baris, 1 kolom, dan 1 sub-grids).
- Lakukan masking terhadap ubin tertentu (angka disembunyikan dan dijadikan text field).
- Ubin yang tidak dimasking bersifat read-only (angka didalamnya tidak bisa diubah).
- Cek apakah urutan tersebut dapat dipecahkan dengan aturan: Setiap angka yang didahului oleh angka yang lebih besar dianggap sebagai inversi, jumlah inversi dari puzzle harus genap.
- Buat listener untuk memproses input. Setiap inputan user akan dicek:
  - Koordinat x dan y dimana inputan tersebut berada.
  - Apakah nilai yang dimasukan pada ubin sesuai dengan jawaban, jika sesuai maka ubah warna tulisan menjadi hijau, jika tidak sesuai maka ubah menjadi warna merah.
  - Highlight ubin yang sudah berisi angka, jika dalam 1 baris, 1 kolom, atau 1 sub-grids berisi angka yang sama dengan inputan user.
- Buat button “Reset/Restart” untuk mengacak ulang grid dan memulai game baru.
