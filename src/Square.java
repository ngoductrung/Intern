public class Square {
    private float canh;


    public Square(float canh) {
        this.canh = canh;
    }

    public void canh(){
        System.out.println("Cạnh của hình vuông là :" + canh);
    }
    public void chuVi(){
        float chuVi = canh * 4;
        System.out.println("Chu vi hình vuông là: "+ chuVi);
    }
    public void dienTich(){
        float dienTich = canh * canh;
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
    }
    public void display(){
        canh();
        chuVi();
        dienTich();
    }
}
