public class Rectangle {
    private float chieuDai;
    private float chieuRong;

    public Rectangle(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void chieuDai(){
        System.out.println("Chiều dài của hình chữ nhật là :" + chieuDai);
    }
    public void chieuRong(){
        System.out.println("Chiều rộng của hình chữ nhật là :" + chieuRong);
    }
    public void chuVi(){
        float chuVi = (chieuDai+chieuRong)*2;
        System.out.println("Chu vi hình chữ nhật là: "+ chuVi);
    }
    public void dienTich(){
        float dienTich = chieuDai*chieuRong;
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
    }
    public void display(){
        chieuDai();
        chieuRong();
        chuVi();
        dienTich();
    }
}
