# 💼 Tax Calculator - Refactoring Assignment

## 📌 Deskripsi
Project ini merupakan hasil refactoring dari kode Java yang sebelumnya mengandung beberapa code smells seperti:
- Magic numbers
- Duplicate code
- Primitive obsession
- Long parameter list
- Long method

Setiap refactor dilakukan dalam branch terpisah dan disertai dengan pull request yang telah di-merge ke branch `main`.

---

## 🔁 Daftar Commit Refactoring

### Refactor 1 - Duplicate Code pada `setMonthlySalary`
- `5e9ae4e` Refactor `setMonthlySalary` untuk menghilangkan duplikasi perhitungan gaji

### Refactor 2 - Primitive Obsession: Gender
- `54df8ec` Refactor `gender` field dari boolean ke enum `Gender` untuk readability dan safety program

### Refactor 3 - Magic Number pada `TaxFunction`
- `db7b696` Refactor magic numbers di `TaxFunction` jadi constants sehingga mudah dibaca dan maintain

### Refactor 4 - Long Method `getAnnualIncomeTax`
- `7bd67b8` Refactor `getAnnualIncomeTax` sebagai method ekstraksi info durasi pekerjaan dan status pernikahan

### Refactor 5 - Primitive Obsession: Spouse & Child
- `f1d9491` Refactor variabel primitive `spouse` dan `children` jadi 2 class baru: `Spouse` dan `Child`

### Refactor 6 - Long Constructor Parameters
- `bb42a37` Refactor untuk mempersingkat parameter di constructor `Employee` dengan class `EmployeeParams`

### Refactor 7 - Magic Number: Gaji
- `a4fdec2` Refactor dengan ganti salary magic numbers pakai `EmployeeGrade` enum

---

## ✅ Initial Commit
- `5623db2` first commit

---

## 🗃️ Struktur Branching
- Setiap refactor dibuat dalam branch terpisah:  
  `DuplicateCode-setMonthlySalary`, `PrimitiveObsession-GenderField`, `MagicNumber-TaxFunction`, `LongMethod-EmployeeGetAnnualIncomeTax`, `PrimitiveObsession-EmployeeSpouseChild`, `Refactor-LongConstructorParams`, `Refactor-MagicNumbersToEnum`
- Setelah refactor selesai, branch di-merge ke `main` via pull request.

---

## 📌 CLO Terkait

### CLO2
- ✅ Ketepatan identifikasi bad smell (7 refactor)
- ✅ Ketepatan penerapan refactoring (dengan pendekatan seperti Extract Method, Replace Magic Number with Symbolic Constant, Replace Primitive with Object, dan Introduce Parameter Object)

### CLO3
- ✅ Repository sudah dibuat dan terdapat initial commit
- ✅ Setiap refactor menggunakan branch dan commit terpisah, sudah dilakukan push dan merge

---

