public class POOEstrutura {
    public static void main(String[] args) {
        Computer m1 = new Computer();
        m1.processor = "Apple M1";
        m1.memoryRAM = 16;
        m1.graphics_card = false;
        m1.sd_card = 256.2;
        m1.showInfos();

        Desktop ryzen5 = new Desktop();
        ryzen5.processor = "Ryzen 5600g";
        ryzen5.memoryRAM = 32;
        ryzen5.graphics_card = true;
        ryzen5.sd_card = 2000.0;

        ryzen5.showInfos();

    }
}

class Computer {
    String processor;
    int memoryRAM;
    boolean graphics_card;
    double sd_card;

    void showInfos() {
        System.out.println(processor);
        System.out.println(memoryRAM);
        System.out.println(graphics_card);
        System.out.println(sd_card);
    }

}
 class Desktop extends Computer {
    boolean isDesktop = true;
 }