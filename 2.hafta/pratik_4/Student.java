package pratik_4;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course matS;
    Course fizikS;
    Course kimyaS;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya,Course matS,Course fizikS, Course kimyaS) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.matS = matS;
        this.fizikS = fizikS;
        this.kimyaS = kimyaS;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya,int matS,int fizikS, int kimyaS) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (mat >= 0 && mat <= 100) {
            this.matS.note = matS;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizikS.note = fizikS;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimyaS.note = kimyaS;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
                System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    
    public void calcAvarage() {
        this.avarage = (((this.fizik.note)*0.8) + ((this.fizikS.note)*0.2) + 
                        ((this.kimya.note)*0.8) + ((this.kimyaS.note)*0.2)+
                        ((this.mat.note)*0.8) + ((this.matS.note)*0.2) )  / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Mat Sınav Notu : " + this.mat.note);
        System.out.println("Fizik Sınav Notu : " + this.fizik.note);
        System.out.println("Kimya Sınav Notu : " + this.kimya.note);
        System.out.println("Mat Sözlü Notu : " + this.matS.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizikS.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimyaS.note);
        
    }

}

